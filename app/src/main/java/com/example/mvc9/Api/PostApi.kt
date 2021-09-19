package com.example.mvc9.Api

import com.example.mvc9.Model.UserDataItem
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface PostApi {

    @GET("users")//get the endpoint
    suspend fun getUserDetails(): Response<List<UserDataItem>>
}