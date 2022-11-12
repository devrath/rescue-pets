package com.petrescue.modules

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PetRescueApplication: Application() {

    // initiate analytics, crashlytics, etc
    override fun onCreate() {
        super.onCreate()

        initLogger()
    }

    private fun initLogger() {
        //Logger.init()
    }
}