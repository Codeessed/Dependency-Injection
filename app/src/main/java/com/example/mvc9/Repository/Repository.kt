package com.example.mvc9.Repository

import com.example.mvc9.Api.PostApi
import com.example.mvc9.Model.UserDataItem
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

class Repository
@Inject
constructor(private val postApi: PostApi){
    suspend fun getUsers() = postApi.getUserDetails()
}