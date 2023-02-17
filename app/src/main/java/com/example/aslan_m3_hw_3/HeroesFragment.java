package com.example.aslan_m3_hw_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class HeroesFragment extends Fragment {

    private ArrayList<String>  heroesList;
    private HeroesAdapter heroesAdapter;
    private RecyclerView rvHeroes;
    private Button btnNextHeroes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_heroes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();

        loadData();
        heroesAdapter = new HeroesAdapter(heroesList);
        rvHeroes.setAdapter(heroesAdapter);
        initListener();
    }

    private void initView() {
        rvHeroes = requireActivity().findViewById(R.id.tv_heroes);
        btnNextHeroes = requireActivity().findViewById(R.id.btn_next_hearoes);
    }

    private void loadData() {
        heroesList = new ArrayList<>();
        heroesList.add("Capitan America");
        heroesList.add("Black Panter");
        heroesList.add("Superman");
        heroesList.add("Flash");
        heroesList.add("Halk");
        heroesList.add("Spider-man");
        heroesList.add("Ant-man");
        heroesList.add("Falkon");
        heroesList.add("Batmen");
        heroesList.add("Tor");
        heroesList.add("Kang");
        heroesList.add("Deadpool");
        heroesList.add("Iron Man");
        heroesList.add("I am Grud");
        heroesList.add("Tanas");


    }

    private void initListener() {
        btnNextHeroes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SneakersFragment sneakersFragment = new SneakersFragment();
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, sneakersFragment)
                        .addToBackStack(null).commit();
            }
        });

    }
}