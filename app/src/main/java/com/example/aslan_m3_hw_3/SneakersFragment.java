package com.example.aslan_m3_hw_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class SneakersFragment extends Fragment {

    private ArrayList<String> sneakersList;
    private SneakersAdapter sneakersAdapter;
    private RecyclerView rvSneakers;
    private Button btnNextSneakers;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sneakers, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        initView();

        loadData();
        sneakersAdapter = new SneakersAdapter(sneakersList);

        rvSneakers.setAdapter(sneakersAdapter);

        initListener();
    }

    private void loadData() {
        sneakersList = new ArrayList<>();
        sneakersList.add("Nike");
        sneakersList.add("Air Force");
        sneakersList.add("Adidas");
        sneakersList.add("Reebok");
        sneakersList.add("Venum");
        sneakersList.add("Yeexy");
        sneakersList.add("Air Jordan");
        sneakersList.add("Lacosta");
        sneakersList.add("New Balance");
        sneakersList.add("Li ning");
        sneakersList.add("Bigser Sport");
        sneakersList.add("Gucci");
        sneakersList.add("Luis Vuitton");
        sneakersList.add("Converse");
        sneakersList.add("Puma");



    }

    private void initListener() {
        btnNextSneakers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarsFragment carsFragment = new CarsFragment();
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, carsFragment)
                        .addToBackStack(null).commit();
            }
        });

    }

    private void initView() {
        rvSneakers = requireActivity().findViewById(R.id.rv_sneakers);
        btnNextSneakers = requireActivity().findViewById(R.id.btn_next_sneakers);
    }

}