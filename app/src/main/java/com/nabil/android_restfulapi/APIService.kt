package com.nabil.android_restfulapi

import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("/en/books")
    fun getBooks(): Call<List<Book>>
}