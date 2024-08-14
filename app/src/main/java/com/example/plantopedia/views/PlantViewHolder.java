package com.example.plantopedia.views;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.plantopedia.R;
import com.example.plantopedia.entity.Plant;

public class PlantViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    View view;

    public PlantViewHolder(View itemView) {
        super(itemView);
        this.textView = (TextView) itemView.findViewById(R.id.tv_name);
        this.view = itemView;
    }

    public void updatePlant(Plant plant) {
        this.textView.setText(plant.name);
    }
}
