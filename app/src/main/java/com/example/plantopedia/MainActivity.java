package com.example.plantopedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.Toast;

import com.example.plantopedia.db.AppDatabase;
import com.example.plantopedia.entity.Plant;
import com.example.plantopedia.views.PlantAdapter;
import com.example.plantopedia.views.PlantClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "PlantopediaDB").build();
        List<Plant> plants = new ArrayList<>();
        for(long i = 0; i < 25; i++) {
            plants.add(new Plant(i, "Plante"+i, Type.HERBE, ""));
        }
        RecyclerView recyclerView = findViewById(R.id.rv_liste);
        PlantClickListener listener = new PlantClickListener() {
            @Override
            public void click(int index){
                CharSequence text = "clicked item index is " + index;
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
            }
        };

        PlantAdapter adapter = new PlantAdapter(plants, getApplicationContext(), listener);
        recyclerView.setAdapter(adapter);





    }

    @Override
    protected void onDestroy() {
        db.close();
        super.onDestroy();
    }
}