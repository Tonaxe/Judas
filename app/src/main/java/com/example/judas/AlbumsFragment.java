package com.example.judas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AlbumsFragment extends Fragment {

    private RecyclerView grid3RecyclerView;
    private Image2Adapter image3Adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_albums, container, false);

        // Initialize RecyclerView for grid images
        grid3RecyclerView = rootView.findViewById(R.id.grid2RecyclerView);
        grid3RecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        List<Integer> gridImages = new ArrayList<>();
        gridImages.add(R.drawable.album1);
        gridImages.add(R.drawable.album2);
        gridImages.add(R.drawable.album3);
        gridImages.add(R.drawable.album4);
        gridImages.add(R.drawable.album5);
        gridImages.add(R.drawable.album6);
        gridImages.add(R.drawable.album7);
        gridImages.add(R.drawable.album8);
        gridImages.add(R.drawable.nada1);
        gridImages.add(R.drawable.nada2);
        image3Adapter = new Image2Adapter(getContext(), gridImages);
        grid3RecyclerView.setAdapter(image3Adapter);

        return rootView;
    }
}
