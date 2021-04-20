package com.galleryapp.gallerytestapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.galleryapp.gallerytestapp.R
import kotlinx.android.synthetic.main.list_item.view.*


class ImageAdapter : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    private var imageList = ArrayList<String>()
    private lateinit var onImageClickListener: OnImageClickListener


    fun update(list: ArrayList<String>, onClickListener: ImageAdapter.OnImageClickListener) {
        this.imageList = list
        this.onImageClickListener = onClickListener
        notifyDataSetChanged()

    }

    fun addItem(url: String) {
        if (!imageList.contains(url)){
            imageList.add(0, url)
            notifyDataSetChanged()
        }
    }

    fun clear() {
        imageList.clear()
        notifyDataSetChanged()
    }


    interface OnImageClickListener {
        fun onImageClick(image: String, position: Int)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(imageList[position])
    }


    override fun getItemCount(): Int {
        return imageList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(image: String) = with(itemView) {
            Glide.with(context).load(image).into(imageView)
            //imageView.load(image)
            imageView.setOnClickListener {
                onImageClickListener.onImageClick(image, position)
            }
        }
    }


}