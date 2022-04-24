package com.example.privatebank.model


import com.google.gson.annotations.SerializedName

data class BezNalDtoItem(
    @SerializedName("base_ccy")
    val baseCcy: String,
    @SerializedName("buy")
    val buy: String,
    @SerializedName("ccy")
    val ccy: String,
    @SerializedName("sale")
    val sale: String
)