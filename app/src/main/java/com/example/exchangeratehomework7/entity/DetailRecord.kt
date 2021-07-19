package com.example.exchangeratehomework7.entity

//{"baseCurrency":"UAH","currency":"CHF","saleRateNB":32.0156000,"purchaseRateNB":32.0156000,"saleRate":33.1500000,"purchaseRate":31.1500000},
data class DetailRecord(
    val baseCurrency: String,
    val currency: String?,
    val saleRateNB: Double,
    val purchaseRateNB: Double,
    val saleRate: Double?,
    val purchaseRate: Double?
)