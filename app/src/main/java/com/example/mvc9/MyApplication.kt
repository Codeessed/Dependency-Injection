package com.example.mvc9

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//application class is extended so that hilt can generate the necessary class in the background
@HiltAndroidApp
class MyApplication: Application() {
}