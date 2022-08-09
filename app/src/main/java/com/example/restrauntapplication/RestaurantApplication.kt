package com.example.restrauntapplication

import android.app.Application
import com.example.restrauntapplication.repository.RestaurantRepository
import timber.log.Timber

class RestaurantApplication : Application() {

    lateinit var restaurantRepository: RestaurantRepository

    override fun onCreate() {
        super.onCreate()
        restaurantRepository = RestaurantRepository()
        Timber.plant(Timber.DebugTree())
    }
}