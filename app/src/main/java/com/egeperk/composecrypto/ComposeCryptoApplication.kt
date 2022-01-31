package com.egeperk.composecrypto

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ComposeCryptoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}