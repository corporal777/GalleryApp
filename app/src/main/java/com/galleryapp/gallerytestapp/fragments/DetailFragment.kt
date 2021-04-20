package com.galleryapp.gallerytestapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.galleryapp.gallerytestapp.R

class DetailFragment : Fragment() {
    private lateinit var mImageViewFull: ImageView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_detail, container, false)
        mImageViewFull = view.findViewById(R.id.iv_full)

        val url = arguments?.getSerializable("url") as String
        Glide.with(this).load(url).into(mImageViewFull)
        return view
    }
}