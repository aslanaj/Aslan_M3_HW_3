package com.example.aslan_m3_hw_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SneakersViewHolder extends RecyclerView.ViewHolder {
    private TextView tvSneakers;
    public SneakersViewHolder(@NonNull View itemView) {
        super(itemView);
        tvSneakers = itemView.findViewById(R.id.tv_sneakers);
    }
    void bindSneakers(String sneakers){
        tvSneakers.setText(sneakers);
    }
}
