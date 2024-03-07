package com.example.judas;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    private ImageView imageMediaskippr;
    private ImageView imageMediaskipne;

    private final String[] songNames = {"ferxxo", "friki", "pami", "xclusivo"};
    private int currentSongIndex = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_playy, container, false);

        imageThumbsup = rootView.findViewById(R.id.imageThumbsup);
        imageMediaskippr = rootView.findViewById(R.id.imageMediaskippr);
        imageMediaskipne = rootView.findViewById(R.id.imageMediaskipne);

        mediaPlayer = new MediaPlayer();
        playSong(songNames[currentSongIndex]);

        imageThumbsup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()) {
                    pauseMusic();
                } else {
                    startMusic();
                }
            }
        });

        imageMediaskippr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playPreviousSong();
            }
        });

        imageMediaskipne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playNextSong();
            }
        });

        return rootView;
    }

    private void startMusic() {
        mediaPlayer.start();
        imageThumbsup.setImageResource(R.drawable.img_thumbsup);
    }

    private void pauseMusic() {
        mediaPlayer.pause();
        imageThumbsup.setImageResource(R.drawable.img_thumbsup);
    }

    private void playPreviousSong() {
        currentSongIndex = (currentSongIndex - 1 + songNames.length) % songNames.length;
        playSong(songNames[currentSongIndex]);
    }

    private void playNextSong() {
        currentSongIndex = (currentSongIndex + 1) % songNames.length;
        playSong(songNames[currentSongIndex]);
    }

    private void playSong(String songName) {
        try {
            mediaPlayer.reset();
            int resId = getResources().getIdentifier(songName, "raw", requireContext().getPackageName());
            mediaPlayer = MediaPlayer.create(requireContext(), resId);
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    playNextSong();
                }
            });
            startMusic();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        View imageArrowleft = view.findViewById(R.id.imageArrowleft);

        imageArrowleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);
                navController.navigate(R.id.action_playyFragment_to_playlistFragment);
            }
        });

        ImageView imageViewAboveFerxxo = view.findViewById(R.id.imageViewAboveFerxxo);

        Glide.with(this)
                .load(R.drawable.img_songcoverart)
                .into(imageViewAboveFerxxo);
    }
}
