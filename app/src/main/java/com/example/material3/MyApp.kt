package com.example.material3

import android.app.Application
import com.google.android.material.color.DynamicColors
import com.google.android.material.color.utilities.DynamicColor

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()


        DynamicColors.applyToActivitiesIfAvailable(this)

    }

}