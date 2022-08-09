package com.example.restrauntapplication.repository

import androidx.lifecycle.LiveData
import com.example.restrauntapplication.data.Restaurant
import com.example.restrauntapplication.network.RemoteService

class RestaurantRepository {




    fun getRestaurants():LiveData<List<Restaurant>> {
//        val list = RemoteService().getData()
//            Transformations.map(RemoteDatabase().getData()) {
//                it.asDomainModel()
//            }
        return RemoteService().getData()
    }
}