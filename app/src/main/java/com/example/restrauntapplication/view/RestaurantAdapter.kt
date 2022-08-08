package com.example.restrauntapplication.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.restrauntapplication.data.Restaurant
import com.example.restrauntapplication.databinding.RestaurantItemBinding
import timber.log.Timber

class RestaurantAdapter(private val viewModel: RestaurantViewModel):
    ListAdapter<Restaurant, RestaurantAdapter.ViewHolder>(RestaurantDiffCallback()){

    var restaurant: List<Restaurant> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Timber.w("onCreateViewHolder")
        return ViewHolder.from(parent)
    }

    override fun getItemCount() = restaurant.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Timber.w("onBindViewHolder")
        val item = restaurant.get(position)
        holder.bind(viewModel,item)
    }


    class ViewHolder private constructor(val binding: RestaurantItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(viewModel: RestaurantViewModel, item: Restaurant) {
            Timber.w("bind data and view model")
            binding.viewmodel = viewModel
            binding.data = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = RestaurantItemBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

}


class RestaurantDiffCallback : DiffUtil.ItemCallback<Restaurant>() {
    override fun areItemsTheSame(oldItem: Restaurant, newItem: Restaurant): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Restaurant, newItem: Restaurant): Boolean {
        return oldItem == newItem
    }
}
