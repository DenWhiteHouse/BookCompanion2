package com.example.bookcompanion2.fragments

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.bookcompanion2.R

@BindingAdapter("BookStatus")
fun bindStatus(statusImageView: ImageView, status: OverviewViewModel.MarsApiStatus?) {
    when (status) {
        OverviewViewModel.MarsApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        OverviewViewModel.MarsApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
        OverviewViewModel.MarsApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
    }
}