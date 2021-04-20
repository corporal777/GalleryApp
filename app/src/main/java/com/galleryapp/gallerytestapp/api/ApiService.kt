package com.galleryapp.gallerytestapp.api

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("task-m-001/list.php")
    suspend fun getImages(): Response<ArrayList<String>>
}