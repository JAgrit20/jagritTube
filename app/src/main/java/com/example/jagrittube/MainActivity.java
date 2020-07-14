package com.example.jagrittube;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaScannerConnection;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView dance = findViewById(R.id.danceVideo);
        dance.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.happy);
        MediaController mediaController = new MediaController(this);
        dance.setMediaController(mediaController);
        mediaController.setAnchorView(dance);
        dance.start();



    }
}
