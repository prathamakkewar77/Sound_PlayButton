package com.example.soundbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callClick(View view){
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.click_sound);
        mediaPlayer.start();
    }
}