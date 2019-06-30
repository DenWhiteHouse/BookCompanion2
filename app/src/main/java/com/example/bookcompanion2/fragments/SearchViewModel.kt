package com.example.bookcompanion2.fragments

import android.content.Context
import android.renderscript.ScriptGroup
import android.view.View
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bookcompanion2.R
import com.example.bookcompanion2.bookdata.BookData
import com.example.bookcompanion2.network.BookApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/**
 * The [ViewModel] that is attached to the [OverviewFragment].
 */
class SearchViewModel : ViewModel() {

    enum class BooksApiStatus { LOADING, ERROR, DONE }

    // The external immutable LiveData for the request status String
    private val _status = MutableLiveData<BooksApiStatus>()
    val status: LiveData<BooksApiStatus>
        get() = _status

    //Book Service Result
    private var _book = BookData()
    val book : BookData
        get() = _book

    //Job for Retrofit Coroutine
    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    private fun getBookByTitle(context: Context, title: String){
        coroutineScope.launch {
            var getBooksDeferred = BookApi.retrofitService.getBooksByName(title)
            try {
                _status.value = BooksApiStatus.LOADING
                var result = getBooksDeferred.await()
                _book = result
                _status.value = BooksApiStatus.DONE
                var temporaryString = book.items.get(0).volumeInfo.pageCount.toString()
                Toast.makeText(context,temporaryString, Toast.LENGTH_SHORT).show()
            }catch(e: Exception){
                _status.value = BooksApiStatus.ERROR
            }
        }
    }

    //Search Function
    fun searchButtonPressed(context: Context, text: String){
        if(!text.isNullOrBlank()){
            getBookByTitle(context, text)
            Toast.makeText(context,text, Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(context,context.getString(R.string.empty_search_warning), Toast.LENGTH_SHORT).show()
        }
    }


}