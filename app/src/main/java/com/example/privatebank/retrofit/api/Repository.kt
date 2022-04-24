package com.example.privatebank.retrofit.api

import com.example.privatebank.model.BezNalDto
import com.example.privatebank.model.BezNalDtoItem

import retrofit2.Response

class Repository {

    fun getBezNal():Response<BezNalDto> {
        return Retrofit.createBezNalApiService().getBezNal()
    }
}