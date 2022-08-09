package com.example.restrauntapplication.viewModel

import androidx.lifecycle.*
import com.example.restrauntapplication.data.Restaurant
import com.example.restrauntapplication.repository.RestaurantRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class RestaurantViewModel(private val restaurantRepository: RestaurantRepository) :ViewModel() {


    lateinit var _items: LiveData<List<Restaurant>>

    init {
        Timber.w("init viewModel")
        viewModelScope.launch(Dispatchers.IO) {
           _items = restaurantRepository.getRestaurants()
            Timber.w("$_items")

        }
    }




    class RestaurantViewModelFactory(
        val restaurantRepository: RestaurantRepository
    ) :
        ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel> create(modelClass: Class<T>) =
            (RestaurantViewModel(restaurantRepository) as T)
    }

}
