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

import com.example.judas.R;

public class PlayyFragment extends Fragment {

    private MediaPlayer mediaPlayer;
    private Button buttonPlay;
    private Button buttonPause;
    private boolean isPlaying = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_play, container, false);

        ImageView imageSongCoverArt = rootView.findViewById(R.id.imageSongCoverArt);

        imageSongCoverArt.setImageResource(R.drawable.img_songcoverart);


        buttonPlay = rootView.findViewById(R.id.button_play);
        buttonPause = rootView.findViewById(R.id.button_pause);

        mediaPlayer = MediaPlayer.create(requireContext(), R.raw.ferxxo);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isPlaying) {
                    startMusic();
                }
            }
        });

        buttonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying) {
                    pauseMusic();
                }
            }
        });

        return rootView;
    }

    private void startMusic() {
        mediaPlayer.start();
        isPlaying = true;
        buttonPlay.setEnabled(false);
        buttonPause.setEnabled(true);
        Toast.makeText(requireContext(), "Music playing", Toast.LENGTH_SHORT).show();
    }

    private void pauseMusic() {
        mediaPlayer.pause();
        isPlaying = false;
        buttonPlay.setEnabled(true);
        buttonPause.setEnabled(false);
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
}
