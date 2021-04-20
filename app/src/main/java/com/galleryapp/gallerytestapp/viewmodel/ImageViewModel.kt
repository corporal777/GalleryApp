package com.galleryapp.gallerytestapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.galleryapp.gallerytestapp.api.ApiClient
import com.galleryapp.gallerytestapp.api.ApiService
import kotlinx.coroutines.launch


class ImageViewModel : ViewModel() {

    private val _imageList = MutableLiveData<ArrayList<String>>()
    val imageList: LiveData<ArrayList<String>> = _imageList


    fun getContent() {

        viewModelScope.launch {
            val retService = ApiClient().getRetrofit().create(ApiService::class.java)
            val response = retService.getImages()
            if (response != null){
                _imageList.value = response.body()
            }

        }

    }

}