package com.example.kotlinsingleton.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ExRetrofitBuilder {

    const val BASE_URL = "https://open-api.xyz/"

    val retrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }

    val apiServices: ApiServices by lazy {
        retrofitBuilder
            .build()
            .create(ApiServices::class.java)
    }
}