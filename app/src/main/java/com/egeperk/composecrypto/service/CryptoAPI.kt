package com.egeperk.composecrypto.service

import com.egeperk.composecrypto.model.Crypto
import com.egeperk.composecrypto.model.CryptoList
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoAPI {

    //https://api.nomics.com/v1/currencies?key=dd8f2f6813f2d37f2cf6fe5e318e7ee170da985c&ids=BTC&attributes=id,name,logo_url
    //https://api.nomics.com/v1/prices?key=dd8f2f6813f2d37f2cf6fe5e318e7ee170da985c

    @GET("prices")
    suspend fun  getCryptoList(
        @Query("key") key : String
    ) : CryptoList

    @GET("currencies")
    suspend fun getCrypto(
        @Query("key") key : String,
        @Query("ids") id : String,
        @Query("attributes") attributes : String
    ) : Crypto

}