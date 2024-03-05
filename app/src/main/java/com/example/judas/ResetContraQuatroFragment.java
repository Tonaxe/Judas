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

public class ResetContraQuatroFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reset_contra_quatro, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener referencia a la imagen
        View btnIniciaSesin = view.findViewById(R.id.btnIniciaSesin);

        // Configurar el clic de la imagen para navegar al fragmento LogRegInicioFragment
        btnIniciaSesin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_resetContraQuatroFragment_to_logInFragment);
            }
        });
    }
}