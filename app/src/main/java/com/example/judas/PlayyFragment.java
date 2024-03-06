package com.example.judas;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.example.judas.R;

public class PlayyFragment extends Fragment {

    private MediaPlayer mediaPlayer;
    private ImageView imageThumbsup;
    private boolean isPlaying = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_playy, container, false);

        imageThumbsup = rootView.findViewById(R.id.imageThumbsup);

        mediaPlayer = MediaPlayer.create(requireContext(), R.raw.ferxxo);

        imageThumbsup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isPlaying) {
                    startMusic();
                } else {
                    pauseMusic();
                }
            }
        });

        return rootView;
    }

    private void startMusic() {
        mediaPlayer.start();
        isPlaying = true;
        imageThumbsup.setImageResource(R.drawable.img_thumbsup); // Cambiar a la imagen de pausa
        Toast.makeText(requireContext(), "Music playing", Toast.LENGTH_SHORT).show();
    }

    private void pauseMusic() {
        mediaPlayer.pause();
        isPlaying = false;
        imageThumbsup.setImageResource(R.drawable.img_thumbsup); // Cambiar a la imagen de reproducción
        Toast.makeText(requireContext(), "Music paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener referencia al botón
        View imageArrowleft = view.findViewById(R.id.imageArrowleft);

        // Configurar el clic del botón para navegar al fragmento LogRegInicioFragment
        imageArrowleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_playyFragment_to_playlistFragment);
            }
        });

        // Obtener referencia a imageViewAboveFerxxo
        ImageView imageViewAboveFerxxo = view.findViewById(R.id.imageViewAboveFerxxo);

        // Cargar la imagen con Glide
        Glide.with(this)
                .load(R.drawable.img_songcoverart) // Aquí debes colocar la URL o el recurso de la imagen que deseas cargar
                .into(imageViewAboveFerxxo);
    }
}

