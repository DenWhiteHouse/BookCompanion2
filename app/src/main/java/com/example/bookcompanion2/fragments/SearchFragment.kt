package com.example.bookcompanion2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.example.bookcompanion2.R
import com.example.bookcompanion2.databinding.OptionFragmentBinding
import com.example.bookcompanion2.databinding.SearchFragmentBinding

class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: SearchFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.search_fragment, container, false
        )

        val editView = binding.bookNameEditView

        binding.searchButton.setOnClickListener { v ->
            if(!editView.text.isNullOrBlank()){
                Toast.makeText(context,editView.text.toString(),Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(context,"Please insert a title first",Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }
}