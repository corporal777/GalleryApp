package com.galleryapp.gallerytestapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.galleryapp.gallerytestapp.fragments.DetailFragment
import com.galleryapp.gallerytestapp.fragments.MainFragment

class MainActivity : AppCompatActivity() , MainFragment.OnFragmentSendDataListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, MainFragment())
                .commit()
        }
    }

    override fun onSendData(url: String) {
        val fragment: DetailFragment? = DetailFragment()
        val bundle: Bundle = Bundle()
        bundle.putSerializable("url", url)

        supportFragmentManager.beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .replace(R.id.fragment_container, fragment!!)
            .addToBackStack(null)
            .commit()
        fragment.arguments = bundle
    }
}