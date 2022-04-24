package com.example.privatebank.retrofit.api

import com.example.privatebank.model.BezNalDto
import com.example.privatebank.model.BezNalDtoItem
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBezNal(): Response<BezNalDto>
}