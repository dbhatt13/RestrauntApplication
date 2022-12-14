package com.example.restrauntapplication.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.restrauntapplication.R
import com.example.restrauntapplication.RestaurantApplication
import com.example.restrauntapplication.viewModel.RestaurantViewModel
import com.example.restrauntapplication.data.Restaurant
import com.example.restrauntapplication.databinding.FragmentRestrauntBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import timber.log.Timber


class RestaurantFragment : Fragment() {

    private val viewModel by viewModels<RestaurantViewModel> {
        RestaurantViewModel.RestaurantViewModelFactory((requireContext().applicationContext as RestaurantApplication).restaurantRepository)
    }

    private lateinit var viewBinding: FragmentRestrauntBinding

    private lateinit var listAdapter: RestaurantAdapter

    private var searchJob: Job? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Timber.w("onCreateView")
        viewBinding = FragmentRestrauntBinding.inflate(inflater, container, false).apply {
            model = viewModel
        }
        if(::viewBinding.isInitialized) {
            viewBinding.lifecycleOwner = this.viewLifecycleOwner
            viewBinding.searchview.clearFocus()
        }
        setUpRecyclerView()
        setUpSearchListener()

        return viewBinding.root
    }



    private fun setUpSearchListener() {
        viewBinding.searchview.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                searchJob?.cancel()
                searchJob = viewLifecycleOwner.lifecycleScope.launch(Dispatchers.Main){
                    delay(400)
                    filterList(newText)
                }
                return true
            }

        })

        viewBinding.searchview.setOnCloseListener(SearchView.OnCloseListener {
            if (::listAdapter.isInitialized)
                listAdapter.restaurant = emptyList()
            else
                Timber.w("listAdapter not initialized")
            return@OnCloseListener true
        })
    }

    private fun setUpRecyclerView() {
        Timber.w("setUpRecyclerView")
        val viewModel = viewBinding.model
        if (viewModel != null && ::viewBinding.isInitialized) {
            listAdapter = RestaurantAdapter(viewModel)
            viewBinding.restaurantList.adapter = listAdapter
            val decorator = DividerItemDecoration(context, LinearLayoutManager.VERTICAL)
            decorator.setDrawable(activity?.let { ContextCompat.getDrawable(it.applicationContext, R.drawable.line_divider) }!!)
            viewBinding.restaurantList.addItemDecoration(
                decorator
            )
        } else {
            Timber.e("ViewModel not initialized ")
        }
    }

     fun filterList(newText: String) {
        if(newText.isEmpty() &&::listAdapter.isInitialized){
            listAdapter.restaurant = emptyList()
            return
        }
        val filterList = mutableListOf<Restaurant>()
        for(item in viewModel._items.value!!){
            if(item.name.contains(newText,true)||
                item.cuisine_type.contains(newText,true))
                filterList.add(item)
        }
        if(filterList.isEmpty()) {
            if (::listAdapter.isInitialized)
                listAdapter.restaurant = emptyList()
            Toast.makeText(context, "No Result", Toast.LENGTH_SHORT).show()
        }else
            listAdapter.restaurant=filterList

    }

}