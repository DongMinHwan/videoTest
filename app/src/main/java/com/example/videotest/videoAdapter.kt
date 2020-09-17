package com.example.videotest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class videoAdapter  (val context: Context, val videolist: ArrayList<video>) : BaseAdapter() {
    override fun getCount(): Int {
        return videolist.size
    }

    override fun getItem(position : Int): Any {
        return videolist[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.videolist, null)

        val name = view.findViewById<TextView>(R.id.name)
        val videoadress = view.findViewById<TextView>(R.id.videoadress)

        val vo = videolist[position]
        name.text = vo.name
        videoadress.text = vo.videoadress
        return  view
    }
}