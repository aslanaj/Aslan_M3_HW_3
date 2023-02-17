package com.example.aslan_m3_hw_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCars;

    public CarsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCars = itemView.findViewById(R.id.tv_cars);
    }

    void bindCars(String cars) {
        tvCars.setText(cars);

    }
}
