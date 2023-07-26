package com.example.android.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DateApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
