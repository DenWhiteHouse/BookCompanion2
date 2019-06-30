package com.example.bookcompanion2.fragments

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.bookcompanion2.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import androidx.core.net.toUri

@BindingAdapter("imgUrl")
fun bindImage(imgView: ImageView, imgUrl: String?){
    imgUrl?.let{
        val imgUri = it.toUri().buildUpon().scheme("https").build()
        Glide.with(imgView.context)
            .load(imgUri)
            .apply(RequestOptions()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_broken_image))
            .into(imgView)
    }
}

@BindingAdapter("BookApiStatus")
fun bindStatus(statusImageView: ImageView, status: SearchViewModel.BooksApiStatus?) {
    when (status) {
        SearchViewModel.BooksApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        SearchViewModel.BooksApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
        SearchViewModel.BooksApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
    }
}