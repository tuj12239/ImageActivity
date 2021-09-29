package edu.temple.imageactivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(val context: Context, _images: Array<ImageClass>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewHolder(imageView: ImageView) : RecyclerView.ViewHolder(imageView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val newHolder = ViewHolder()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}