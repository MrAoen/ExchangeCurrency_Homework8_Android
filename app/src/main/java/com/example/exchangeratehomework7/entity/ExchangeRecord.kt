package com.example.exchangeratehomework7.entity

//"date":"01.01.2021","bank":"PB","baseCurrency":980,"baseCurrencyLit":"UAH","exchangeRate"
data class ExchangeRecord(
    val date: String,
    val bank: String,
    val baseCurrency: String,
    val baseCurrencyLit: String,
    val exchangeRate: List<DetailRecord>
)