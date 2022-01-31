package com.egeperk.composecrypto.repo

import com.egeperk.composecrypto.model.Crypto
import com.egeperk.composecrypto.model.CryptoList
import com.egeperk.composecrypto.service.CryptoAPI
import com.egeperk.composecrypto.util.Constants.API_KEY
import com.egeperk.composecrypto.util.Constants.CALL_ATTRIBUTES
import com.egeperk.composecrypto.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject
import kotlin.contracts.ReturnsNotNull


@ActivityScoped
class CryptoRepository @Inject constructor(private val api : CryptoAPI) {
    suspend fun getCryptoList() : Resource<CryptoList> {
        val response = try {
            api.getCryptoList(API_KEY)
        } catch (e: Exception) {
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }

    suspend fun getCrypto(id : String) : Resource<Crypto> {
        val response = try {
            api.getCrypto(API_KEY,id,CALL_ATTRIBUTES)
        } catch (e : Exception) {
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }
}