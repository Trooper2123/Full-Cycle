package br.com.zup.beagle.chat.config

import android.app.Application
import br.com.zup.beagle.chat.BeagleSetup

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }
}