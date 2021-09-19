package com.example.mvc9.Repository

import com.example.mvc9.Api.PostApi
import javax.inject.Inject

class Repository
@Inject
constructor(private val postApi: PostApi){
    suspend fun getUsers() = postApi.getUserDetails()
}