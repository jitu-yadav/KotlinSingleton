package com.example.kotlinsingleton.api

import com.example.kotlinsingleton.models.User
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServices {

    @GET("placeholder/user/{userId}")
    suspend fun getUser(
        @Path("userId") userId: String
    ): User
}