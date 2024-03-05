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
import com.example.judas.R;

public class LogInFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_log_in, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener referencia a la imagen
        View imageArrowleft = view.findViewById(R.id.imageArrowleft);

        // Configurar el clic de la imagen para navegar al fragmento LogRegInicioFragment
        imageArrowleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_logInFragment_to_logRegInicioFragment);
            }
        });

        // Obtener referencia a la imagen
        View txtRegistrarse = view.findViewById(R.id.txtRegistrarse);

        // Configurar el clic de la imagen para navegar al fragmento LogRegInicioFragment
        txtRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_logInFragment_to_sigInFragment);
            }
        });

        // Obtener referencia a la imagen
        View btnIniciarSesin = view.findViewById(R.id.btnIniciarSesin);

        // Configurar el clic de la imagen para navegar al fragmento LogRegInicioFragment
        btnIniciarSesin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_logInFragment_to_homeFragment);
            }
        });

        // Obtener referencia a la imagen
        View imageGooglelogo = view.findViewById(R.id.imageGooglelogo);

        // Configurar el clic de la imagen para navegar al fragmento LogRegInicioFragment
        imageGooglelogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_logInFragment_to_googleLogInFragment);
            }
        });

        // Obtener referencia a la imagen
        View txtGoogle = view.findViewById(R.id.txtGoogle);

        // Configurar el clic de la imagen para navegar al fragmento LogRegInicioFragment
        txtGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_logInFragment_to_googleLogInFragment);
            }
        });
    }
}
