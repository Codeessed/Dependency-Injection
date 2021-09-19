package com.example.mvc9

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.mvc9.MainViewModels.ViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

//this annotation is needed to whenever a dependency needs to be injected
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel:ViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //observes the response in the the viewmodel and performs the block function on it
        viewModel._myUsers.observe(this, Observer {response ->
                Log.d("TAG", response.toString())
        })

    }


}