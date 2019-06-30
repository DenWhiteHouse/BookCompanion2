package com.example.bookcompanion2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import com.example.bookcompanion2.R
import com.example.bookcompanion2.databinding.SearchFragmentBinding

class SearchFragment : Fragment() {

    /**
     * Lazily initialize our [OverviewViewModel].
     */
    private val viewModel: SearchViewModel by lazy {
        ViewModelProviders.of(this).get(SearchViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: SearchFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.search_fragment, container, false
        )

        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment
        binding.setLifecycleOwner(this)

        val editView = binding.bookNameEditView
        // Giving the binding access to the OverviewViewModel
        binding.viewModel = viewModel

        binding.searchButton.setOnClickListener { v ->
            viewModel.searchButtonPressed(context!!,editView.text.toString())
        }

        // Fetching Observer
        viewModel.status.observe(this, Observer {status ->
            when(status){
                SearchViewModel.BooksApiStatus.DONE -> {
                    bindBookInfo(binding)
                    //binding.saveBookButton.visibility = View.VISIBLE
                }
            }
        })

        return binding.root
    }

    private fun bindBookInfo(binding: SearchFragmentBinding) {
        binding.authorNameTV.setText(viewModel.book.items.get(0).volumeInfo.authors.get(0))
        binding.bookNameTV.setText(viewModel.book.items.get(0).volumeInfo.title)
        binding.numPagesBookTV.setText(viewModel.book.items.get(0).volumeInfo.pageCount.toString())
    }
}