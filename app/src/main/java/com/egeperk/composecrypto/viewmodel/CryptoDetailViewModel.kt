package com.egeperk.composecrypto.viewmodel

import androidx.lifecycle.ViewModel
import com.egeperk.composecrypto.model.Crypto
import com.egeperk.composecrypto.repo.CryptoRepository
import com.egeperk.composecrypto.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class CryptoDetailViewModel @Inject constructor(private val repository: CryptoRepository) :
    ViewModel() {

        suspend fun getCrypto(id : String) : Resource<Crypto>{
            return repository.getCrypto(id)
        }



}