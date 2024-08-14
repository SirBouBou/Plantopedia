package com.example.plantopedia.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.plantopedia.R;
import com.example.plantopedia.entity.Plant;

import java.util.List;

public class PlantAdapter extends RecyclerView.Adapter<PlantViewHolder> {

    private List<Plant> plantList;
    Context context;
    PlantClickListener listener;

    public PlantAdapter(List<Plant> plantList, Context context, PlantClickListener listener) {
        this.plantList = plantList;
        this.context = context;
        this.listener = listener;
    }

    @Override
    public PlantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // CREATE VIEW HOLDER AND INFLATING ITS XML LAYOUT
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_item, parent, false);

        return new PlantViewHolder(view);
    }

    // UPDATE VIEW HOLDER WITH A GITHUBUSER
    @Override
    public void onBindViewHolder(PlantViewHolder viewHolder, int position) {
        final int index = viewHolder.getBindingAdapterPosition();
        viewHolder.updatePlant(this.plantList.get(position));
        viewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.click(index);
            }
        });
    }

    // RETURN THE TOTAL COUNT OF ITEMS IN THE LIST
    @Override
    public int getItemCount() {
        return this.plantList.size();
    }

    @Override
    public void onAttachedToRecyclerView(
            RecyclerView recyclerView)
    {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
