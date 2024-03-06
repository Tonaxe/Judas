package com.example.judas;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PlayFragment extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private Button buttonPlay;
    private Button buttonPause;
    private boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_play);

        buttonPlay = findViewById(R.id.button_play);
        buttonPause = findViewById(R.id.button_pause);

        mediaPlayer = MediaPlayer.create(this, R.raw.ferxxo);

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
    }

    private void startMusic() {
        mediaPlayer.start();
        isPlaying = true;
        buttonPlay.setEnabled(false);
        buttonPause.setEnabled(true);
        Toast.makeText(this, "Music playing", Toast.LENGTH_SHORT).show();
    }

    private void pauseMusic() {
        mediaPlayer.pause();
        isPlaying = false;
        buttonPlay.setEnabled(true);
        buttonPause.setEnabled(false);
        Toast.makeText(this, "Music paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
