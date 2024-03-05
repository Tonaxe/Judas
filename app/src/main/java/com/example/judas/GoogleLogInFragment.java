package com.example.judas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GoogleLogInFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_google_log_in, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener referencia al botón
        View linearRowlock = view.findViewById(R.id.linearRowlock);

        // Configurar el clic del botón para navegar al fragmento LogRegInicioFragment
        linearRowlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_googleLogInFragment_to_homeFragment);
            }
        });

        // Obtener referencia al botón
        View linearRowlockOne = view.findViewById(R.id.linearRowlockOne);

        // Configurar el clic del botón para navegar al fragmento LogRegInicioFragment
        linearRowlockOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_googleLogInFragment_to_homeFragment);
            }
        });


        // Obtener referencia al botón
        View linearRowlockTwo = view.findViewById(R.id.linearRowlockTwo);

        // Configurar el clic del botón para navegar al fragmento LogRegInicioFragment
        linearRowlockTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_googleLogInFragment_to_homeFragment);
            }
        });

        // Obtener referencia al botón
        View linearRowlockThree = view.findViewById(R.id.linearRowlockThree);

        // Configurar el clic del botón para navegar al fragmento LogRegInicioFragment
        linearRowlockThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_googleLogInFragment_to_homeFragment);
            }
        });


        // Obtener referencia al botón
        View linearRowlockFour = view.findViewById(R.id.linearRowlockFour);

        // Configurar el clic del botón para navegar al fragmento LogRegInicioFragment
        linearRowlockFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_googleLogInFragment_to_homeFragment);
            }
        });

        // Obtener referencia al botón
        View linearRowlockFive = view.findViewById(R.id.linearRowlockFive);

        // Configurar el clic del botón para navegar al fragmento LogRegInicioFragment
        linearRowlockFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_googleLogInFragment_to_homeFragment);
            }
        });

        // Obtener referencia al botón
        View imageArrowleft = view.findViewById(R.id.imageArrowleft);

        // Configurar el clic del botón para navegar al fragmento LogRegInicioFragment
        imageArrowleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_googleLogInFragment_to_logRegInicioFragment);
            }
        });

        // Obtener referencia al botón
        View txtAadircorreo = view.findViewById(R.id.txtAadircorreo);

        // Configurar el clic del botón para navegar al fragmento LogRegInicioFragment
        txtAadircorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_googleLogInFragment_to_googleAddFragment);
            }
        });
    }
}