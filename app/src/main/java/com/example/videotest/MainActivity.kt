package com.example.videotest

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var vv: VideoView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vv = findViewById<VideoView>(R.id.videoView)
        //URI 로 영상재생
        //var videoUri = Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4")
        //자신의 pc의 저장되있는 영상재생
        var videoUri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.dog)
        //vv.setMediaController(MediaController(this))
        vv.setMediaController(MediaController(this))
        vv.setVideoURI(videoUri)

        vv.setOnPreparedListener(MediaPlayer.OnPreparedListener {
            fun onPrepared(mediaPlayer: MediaPlayer) {

                vv.start()
            }
        })

    }
    override fun onPause() {
        super.onPause()

        //비디오 일시 정지
        if (vv != null && vv!!.isPlaying) vv!!.pause()
    }

    //액티비티가 메모리에서 사라질때..
    override fun onDestroy() {
        super.onDestroy()
        //
        if (vv != null) vv!!.stopPlayback()
    }

}

