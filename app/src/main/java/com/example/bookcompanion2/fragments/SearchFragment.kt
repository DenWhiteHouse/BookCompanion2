package com.example.bookcompanion2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
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

        val editView = binding.bookNameEditView
        // Giving the binding access to the OverviewViewModel
        binding.viewModel = viewModel

        binding.searchButton.setOnClickListener { v ->
            viewModel.searchButtonPressed(context!!,editView.text.toString())
        }

        return binding.root
    }
}