package com.example.judas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private ImageAdapter imageAdapter;
    private List<Integer> imageList;

    private RecyclerView gridRecyclerView;
    private Image2Adapter image2Adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize RecyclerView for horizontal images
        recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        imageList = new ArrayList<>();
        imageList.add(R.drawable.uno);
        imageList.add(R.drawable.dos);
        imageList.add(R.drawable.tres);
        imageList.add(R.drawable.quatro);
        imageList.add(R.drawable.cinco);
        imageList.add(R.drawable.seis);
        // Add more images...
        imageAdapter = new ImageAdapter(getContext(), imageList);
        recyclerView.setAdapter(imageAdapter);

        // Initialize RecyclerView for grid images
        gridRecyclerView = rootView.findViewById(R.id.gridRecyclerView);
        gridRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        List<Integer> gridImages = new ArrayList<>();
        gridImages.add(R.drawable.uno_grid);
        gridImages.add(R.drawable.dos_grid);
        gridImages.add(R.drawable.tres_grid);
        gridImages.add(R.drawable.quatro_grid);
        gridImages.add(R.drawable.cinco_grid);
        gridImages.add(R.drawable.seis_grid);
        gridImages.add(R.drawable.siete_grid);
        gridImages.add(R.drawable.ocho_grid);
        gridImages.add(R.drawable.nada1);
        gridImages.add(R.drawable.nada2);
        image2Adapter = new Image2Adapter(getContext(), gridImages);
        gridRecyclerView.setAdapter(image2Adapter);

        return rootView;
    }
}
