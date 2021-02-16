package com.example.daggerwithretrofit.data

data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Rates
)