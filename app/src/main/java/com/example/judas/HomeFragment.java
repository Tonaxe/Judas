package com.example.judas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private ImageAdapter imageAdapter;
    private List<Integer> imageList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflar el diseño del fragmento
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        imageList = new ArrayList<>();
        imageList.add(R.drawable.uno);
        imageList.add(R.drawable.dos);
        imageList.add(R.drawable.tres);
        imageList.add(R.drawable.quatro);
        imageList.add(R.drawable.cinco);
        imageList.add(R.drawable.seis);
        // Agrega las demás imágenes...

        // Inicializar RecyclerView
        recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        imageAdapter = new ImageAdapter(getContext(), imageList);
        recyclerView.setAdapter(imageAdapter);

        return rootView;
    }
}
