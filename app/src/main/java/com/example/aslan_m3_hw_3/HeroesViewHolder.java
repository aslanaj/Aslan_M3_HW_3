package com.example.aslan_m3_hw_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HeroesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvHeroes;

    public HeroesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvHeroes = itemView.findViewById(R.id.tv_heroes);
    }
    void bindHeroes(String heroes){
        tvHeroes.setText(heroes);
    }
}
