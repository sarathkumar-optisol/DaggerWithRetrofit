package com.example.daggerwithretrofit.main

import com.example.daggerwithretrofit.data.CurrencyResponse
import com.example.daggerwithretrofit.util.Resource
import retrofit2.Response

interface MainRepository {

    suspend fun getRates(base : String) : Resource<CurrencyResponse>
}