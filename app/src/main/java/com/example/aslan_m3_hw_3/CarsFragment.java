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

public class CarsFragment extends Fragment {

    private ArrayList<String> carsList;
    private CarsAdapter carsAdapter;
    private RecyclerView rvCars;
    private Button btnNextCars;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cars, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();

        loadData();
        carsAdapter = new CarsAdapter(carsList);
        rvCars.setAdapter(carsAdapter);
        initListener();}

    private void loadData() {
        carsList = new ArrayList<>();
        carsList.add("BMW");
        carsList.add("Mers");
        carsList.add("Mazda");
        carsList.add("Subaru");
        carsList.add("Toyota");
        carsList.add("Honda");
        carsList.add("Shevralet");
        carsList.add("Golf");
        carsList.add("Cadilac");
        carsList.add("Ferrari");
        carsList.add("Maserati");
        carsList.add("Astan Martin");
        carsList.add("Rolls Rolls");
        carsList.add("Tesla");
        carsList.add("GMC");
    }

    private void initListener() {
        btnNextCars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HeroesFragment heroesFragment = new HeroesFragment();
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new HeroesFragment())
                        .addToBackStack(null).commit();
            }
        });

    }

    private void initView() {
        rvCars = requireActivity().findViewById(R.id.rv_cars);
        btnNextCars = requireActivity().findViewById(R.id.btn_next_cars);
    }
}