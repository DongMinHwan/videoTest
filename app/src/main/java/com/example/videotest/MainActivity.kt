package com.example.videotest

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.AdapterView
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.videolist.view.*

class MainActivity : AppCompatActivity() {

    var videolist = arrayListOf<video>(
        video("영상1","http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"),
        video("영상2","http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainListView.adapter = videoAdapter(this,videolist)
     //   mainListView.onItemClickListener = AdapterView.OnItemClickListener{}
        mainListView.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            var intent = Intent(this, videoActivity::class.java)

            intent.putExtra("video",view.videoadress.getText().toString())

            startActivity(intent)
        }
        }
    }

