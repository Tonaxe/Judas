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
import android.widget.ImageView;
import android.widget.LinearLayout;

public class PlaylistFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_playlist, container, false);

        // Obtener referencia al ImageView
        ImageView imageSongCoverArt1 = rootView.findViewById(R.id.imageSongCoverArt1);

        // Establecer la imagen deseada programáticamente
        imageSongCoverArt1.setImageResource(R.drawable.img_songcoverart);

        // Obtener referencia al ImageView
        ImageView imageSongCoverArt = rootView.findViewById(R.id.imageSongCoverArt);

        // Establecer la imagen deseada programáticamente
        imageSongCoverArt.setImageResource(R.drawable.img_songcoverart);

        // Obtener referencia al ImageView
        ImageView imageSongCoverArt2 = rootView.findViewById(R.id.imageSongCoverArt2);

        // Establecer la imagen deseada programáticamente
        imageSongCoverArt2.setImageResource(R.drawable.img_songcoverart);

        // Obtener referencia al ImageView
        ImageView imageSongCoverArt3 = rootView.findViewById(R.id.imageSongCoverArt3);

        // Establecer la imagen deseada programáticamente
        imageSongCoverArt3.setImageResource(R.drawable.img_songcoverart);

        // Obtener referencia al ImageView
        ImageView imageSongCoverArt4 = rootView.findViewById(R.id.imageSongCoverArt4);

        // Establecer la imagen deseada programáticamente
        imageSongCoverArt4.setImageResource(R.drawable.img_songcoverart);

        // Obtener referencia al ImageView
        ImageView imageSongCoverArt5 = rootView.findViewById(R.id.imageSongCoverArt5);

        // Establecer la imagen deseada programáticamente
        imageSongCoverArt5.setImageResource(R.drawable.img_songcoverart);

        // Obtener referencia al ImageView
        ImageView imageSongCoverArt6 = rootView.findViewById(R.id.imageSongCoverArt6);

        // Establecer la imagen deseada programáticamente
        imageSongCoverArt6.setImageResource(R.drawable.img_songcoverart);

        // Obtener referencia al ImageView
        ImageView imageSongCoverArt7 = rootView.findViewById(R.id.imageSongCoverArt7);

        // Establecer la imagen deseada programáticamente
        imageSongCoverArt7.setImageResource(R.drawable.img_songcoverart);

        // Obtener referencia al ImageView
        ImageView imageSongCoverArt8 = rootView.findViewById(R.id.imageSongCoverArt8);

        // Establecer la imagen deseada programáticamente
        imageSongCoverArt8.setImageResource(R.drawable.img_songcoverart);

        // Obtener referencia al ImageView
        ImageView imageSongCoverArt9 = rootView.findViewById(R.id.imageSongCoverArt9);

        // Establecer la imagen deseada programáticamente
        imageSongCoverArt9.setImageResource(R.drawable.img_songcoverart);

        LinearLayout linearRowsongcoverart1 = rootView.findViewById(R.id.linearRowsongcoverart1);
        linearRowsongcoverart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al PlayFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_playlistFragment_to_playyFragment);
            }
        });

        LinearLayout linearRowsongcoverart2 = rootView.findViewById(R.id.linearRowsongcoverart2);
        linearRowsongcoverart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al PlayFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_playlistFragment_to_playyFragment);
            }
        });


        LinearLayout linearRowsongcoverart3 = rootView.findViewById(R.id.linearRowsongcoverart3);
        linearRowsongcoverart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al PlayFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_playlistFragment_to_playyFragment);
            }
        });

        LinearLayout linearRowsongcoverart = rootView.findViewById(R.id.linearRowsongcoverart);
        linearRowsongcoverart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al PlayFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_playlistFragment_to_playyFragment);
            }
        });

        LinearLayout linearRowsongcoverart4 = rootView.findViewById(R.id.linearRowsongcoverart4);
        linearRowsongcoverart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al PlayFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_playlistFragment_to_playyFragment);
            }
        });

        LinearLayout linearRowsongcoverart5 = rootView.findViewById(R.id.linearRowsongcoverart5);
        linearRowsongcoverart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al PlayFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_playlistFragment_to_playyFragment);
            }
        });


        LinearLayout linearRowsongcoverart6 = rootView.findViewById(R.id.linearRowsongcoverart6);
        linearRowsongcoverart6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al PlayFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_playlistFragment_to_playyFragment);
            }
        });

        LinearLayout linearRowsongcoverart7 = rootView.findViewById(R.id.linearRowsongcoverart7);
        linearRowsongcoverart7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al PlayFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_playlistFragment_to_playyFragment);
            }
        });

        LinearLayout linearRowsongcoverart8 = rootView.findViewById(R.id.linearRowsongcoverart8);
        linearRowsongcoverart8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al PlayFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_playlistFragment_to_playyFragment);
            }
        });


        LinearLayout linearRowsongcoverart9 = rootView.findViewById(R.id.linearRowsongcoverart9);
        linearRowsongcoverart9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al PlayFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_playlistFragment_to_playyFragment);
            }
        });



        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener referencia a la imagen
        View toolbarToolbar = view.findViewById(R.id.toolbarToolbar);

        // Configurar el clic de la imagen para navegar al fragmento LogRegInicioFragment
        toolbarToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_playlistFragment_to_homeFragment);
            }
        });

    }
}
