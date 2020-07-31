package br.com.zup.beagle.chat.beagle

import android.app.Application
import br.com.zup.beagle.chat.config.BeagleSetup

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        BeagleSetup().init(this)

    }
}