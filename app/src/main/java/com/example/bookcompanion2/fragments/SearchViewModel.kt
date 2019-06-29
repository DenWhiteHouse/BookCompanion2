package com.example.bookcompanion2.fragments

import android.content.Context
import android.provider.Settings.Global.getString
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bookcompanion2.R
import com.example.bookcompanion2.bookdata.Book

/**
 * The [ViewModel] that is attached to the [OverviewFragment].
 */
class SearchViewModel : ViewModel() {

    //Book Service Result
    private val _books = MutableLiveData<List<Book>>()
    val books : LiveData<List<Book>>
        get() = _books




    //Search Function
    fun searchButtonPressed(context: Context, text: String){
        if(!text.isNullOrBlank()){
            Toast.makeText(context,text.toString(), Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(context,context.getString(R.string.empty_search_warning), Toast.LENGTH_SHORT).show()
        }
    }

}