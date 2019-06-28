package com.example.bookcompanion2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import com.example.bookcompanion2.R
import com.example.bookcompanion2.databinding.OptionFragmentBinding

/**
* Fragment for the option screen of the app
*/
class OptionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: OptionFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.option_fragment, container, false)

        return binding.root
    }
}