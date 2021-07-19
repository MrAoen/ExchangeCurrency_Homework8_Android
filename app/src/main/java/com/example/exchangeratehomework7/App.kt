package com.example.exchangeratehomework7

import android.app.Application

class App : Application() {
    companion object {
        var year: Int = 2021
        var month: Int = 1
        var day: Int = 1
    }

    override fun onCreate() {
        super.onCreate()
    }


}