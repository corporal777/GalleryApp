package com.galleryapp.gallerytestapp.fragments

import android.content.Context
import android.graphics.Point
import android.os.Bundle
import android.view.Display
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.galleryapp.gallerytestapp.R
import com.galleryapp.gallerytestapp.adapter.ImageAdapter
import com.galleryapp.gallerytestapp.viewmodel.ImageViewModel


class MainFragment : Fragment() {

    private lateinit var mRecyclerView: RecyclerView
    private lateinit var adapter: ImageAdapter
    private var viewModel = ImageViewModel()
    private lateinit var mSwipeRefreshLayout: SwipeRefreshLayout
    private var fragmentSendDataListener: OnFragmentSendDataListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_main, container, false)
        mRecyclerView = view.findViewById(R.id.recycler_view)
        mSwipeRefreshLayout = view.findViewById(R.id.swipe_refresh_layout)

        initRV()
        initViewModel()

        mSwipeRefreshLayout.setOnRefreshListener {
            adapter.clear()
            viewModel.getContent()
            initViewModel()
            mSwipeRefreshLayout.isRefreshing = false
        }
        return view

    }


    interface OnFragmentSendDataListener {
        fun onSendData(url: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentSendDataListener = try {
            context as OnFragmentSendDataListener
        } catch (e: ClassCastException) {
            throw ClassCastException("$context должен реализовывать интерфейс OnFragmentInteractionListener")
        }
    }


    private fun initRV() {

        val display: Display = activity?.getWindowManager()!!.getDefaultDisplay()
        val size: Point = Point()
        display.getSize(size)
        val width: Int = size.x
        val height: Int = size.y

        if (width > 1200) {
            mRecyclerView.layoutManager =
                GridLayoutManager(activity, 3)
        } else {
            mRecyclerView.layoutManager =
                GridLayoutManager(activity, 2)
        }
        adapter = ImageAdapter()
        mRecyclerView.adapter = adapter
    }


    private fun initViewModel() {
        //viewModel.getContent()
        viewModel = ViewModelProvider(this).get(ImageViewModel::class.java)
        viewModel.imageList.observe(activity!!, Observer {

            val imageClickListener: ImageAdapter.OnImageClickListener =
                object : ImageAdapter.OnImageClickListener {
                    override fun onImageClick(image: String, position: Int) {
                        if (image != null) {
                            fragmentSendDataListener?.onSendData(image)
                        }
                    }

                }

            adapter.update(it, imageClickListener)
        })
    }

    override fun onResume() {
        super.onResume()
        viewModel.getContent()
    }
}