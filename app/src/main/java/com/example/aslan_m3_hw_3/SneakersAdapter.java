package com.example.aslan_m3_hw_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SneakersAdapter extends RecyclerView.Adapter<SneakersViewHolder> {
    private ArrayList<String> sneakersList;

    public SneakersAdapter(ArrayList<String> sneakersList) {
        this.sneakersList = sneakersList;
    }

    @NonNull
    @Override
    public SneakersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SneakersViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_sneakers, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SneakersViewHolder holder, int position) {
        holder.bindSneakers(sneakersList.get(position));
    }

    @Override
    public int getItemCount() {
        return sneakersList.size();
    }
}
