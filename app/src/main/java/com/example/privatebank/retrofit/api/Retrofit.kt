package com.example.privatebank.retrofit.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {
    private var retrofit:Retrofit = Retrofit.Builder()
        .baseUrl("https://api.privatbank.ua/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

  fun createBezNalApiService():ApiService = retrofit.create(ApiService::class.java)
}