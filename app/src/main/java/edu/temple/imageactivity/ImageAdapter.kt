package edu.temple.imageactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(val _context: Context, _images: Array<ImageClass>) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    private val context = _context
    private val images = _images
    private val inflater = LayoutInflater.from(context)

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

        //holder.view.setOnClickListener{changeMainViews(position)}
    }

    //private fun changeMainViews(index: Int) {}

    override fun getItemCount(): Int {
        return images.size
    }

}