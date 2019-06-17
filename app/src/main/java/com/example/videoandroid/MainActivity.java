package com.example.videoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.demo);

        //give controls pause etc.
        MediaController mediaController = new MediaController(this);

        //link to media feed
        mediaController.setAnchorView(videoView);

        //allow it to control videoView
        videoView.setMediaController(mediaController);


        videoView.start();


    }
}
