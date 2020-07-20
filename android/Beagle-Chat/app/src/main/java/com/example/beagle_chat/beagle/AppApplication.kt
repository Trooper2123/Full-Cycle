package com.example.beagle_chat.beagle

import android.app.Application

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }
}