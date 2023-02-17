package com.example.aslan_m3_hw_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeroesAdapter extends RecyclerView.Adapter<HeroesViewHolder> {
    private ArrayList<String> heroesList;

    public HeroesAdapter(ArrayList<String> heroesList) {
        this.heroesList = heroesList;
    }

    @NonNull
    @Override
    public HeroesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HeroesViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_heroes, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HeroesViewHolder holder, int position) {
        holder.bindHeroes(heroesList.get(position));
    }

    @Override
    public int getItemCount() {
        return heroesList.size();
    }
}
