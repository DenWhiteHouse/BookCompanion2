package com.example.bookcompanion2.network

import com.example.bookcompanion2.bookdata.BookData
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import com.google.gson.GsonBuilder
import com.google.gson.Gson



private const val BASE_URL = "https://www.googleapis.com/books/v1/"

var gson = GsonBuilder().create()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create(gson))
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .baseUrl(BASE_URL)
    .build()

interface BookApiService {
    @GET("volumes")
    fun getBooksByName(
        @Query("q") booktitle : String
    ):
            Deferred<BookData>
}

object BookApi{
    val retrofitService: BookApiService by lazy{
        retrofit.create(BookApiService::class.java)

    }
}