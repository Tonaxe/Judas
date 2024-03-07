package com.example.judas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class PerfilFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflar el diseño del fragmento
        return inflater.inflate(R.layout.fragment_perfil, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener referencia a la imagen
        View btnCancerlar = view.findViewById(R.id.btnCancerlar);

        // Configurar el clic de la imagen para navegar al fragmento LogRegInicioFragment
        btnCancerlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_perfilFragment_to_homeFragment);
            }
        });


        // Obtener referencia a la imagen
        View btnGuardar = view.findViewById(R.id.btnGuardar);

        // Configurar el clic de la imagen para navegar al fragmento LogRegInicioFragment
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_perfilFragment_to_homeFragment);
            }
        });

        // Obtener referencia a la imagen
        View imageArrowleft = view.findViewById(R.id.imageArrowleft);

        // Configurar el clic de la imagen para navegar al fragmento LogRegInicioFragment
        imageArrowleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_perfilFragment_to_homeFragment);
            }
        });
    }
}
