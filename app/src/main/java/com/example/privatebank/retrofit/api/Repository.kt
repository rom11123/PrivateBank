package com.example.privatebank.retrofit.api

import com.example.privatebank.model.BezNalDto

import retrofit2.Response

class Repository {

    suspend fun getBezNal(): Response<BezNalDto> {
        return Retrofit.createBezNalApiService().getBezNal()
    }
}