package br.com.zup.beagle.chat.config

import android.app.Application

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        BeagleSetup().init(this)

    }
}