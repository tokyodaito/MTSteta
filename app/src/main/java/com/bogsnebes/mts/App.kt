package com.bogsnebes.mts

import android.app.Application
import android.content.Context


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        application = this
    }

    companion object {
        var application: Application? = null
            private set
        val context: Context
            get() = application!!.applicationContext
    }
}