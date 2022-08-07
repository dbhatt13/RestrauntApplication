package com.example.restrauntapplication.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import timber.log.Timber

class RestaurantRepository {




    fun getRestaurants():LiveData<List<Restaurant>> {
        val list =RemoteDatabase().getData()
//            Transformations.map(RemoteDatabase().getData()) {
//                it.asDomainModel()
//            }
        return list
    }
}