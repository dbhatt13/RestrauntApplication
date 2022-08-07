package com.example.restrauntapplication.view.Util

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageUrl","placeholder","error")
fun imageUrl(imageView: ImageView, url: String, placeholder: Drawable,error:Drawable) {
    Glide.with(imageView.context)
        .load(url)
        .placeholder(placeholder)
        .error(error)
        .into(imageView)

}
