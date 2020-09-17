package com.example.videotest

import android.app.Activity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class VideoViewActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        val videoView = findViewById<VideoView>(R.id.videoView)

        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        videoView.setVideoPath() // );
            // videoView.setVideoURL(url);


            //final MediaController mediaController =
              //  new MediaController(this);
        //    videoView.setMediaController(mediaController);

    }
}