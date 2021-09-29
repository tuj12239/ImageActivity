package edu.temple.imageactivity

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(val _context: Context, _images: Array<ImageClass>, _text: TextView, _image: ImageView) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    private val context = _context
    private val images = _images
    private val inflater = LayoutInflater.from(context)
    private val text = _text
    private val image = _image

    class ViewHolder(_view: View) : RecyclerView.ViewHolder(_view) {
        val view = _view
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.imageview, null)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gridImage = holder.view.findViewById<ImageView>(R.id.gridImage)
        gridImage.setImageResource(images[position].resource)
        gridImage.setOnClickListener{changeMainViews(position)}
    }

    private fun changeMainViews(index: Int) {
        text.text = images[index].label
        image.setImageResource(images[index].resource)
    }

    override fun getItemCount(): Int {
        return images.size
    }

}