package com.example.exchangeratehomework7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.exchangeratehomework7.adapters.ExchangeRecyclerViewAdapter
import com.example.exchangeratehomework7.entity.DetailRecord
import com.example.exchangeratehomework7.entity.ExchangeRecord
import com.example.exchangeratehomework7.utils.Helper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

class ExchangeRatesOfDay : AppCompatActivity() {
    lateinit var rcView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exchange_rates_of_day)

        rcView = findViewById(R.id.recyclerView)
        rcView.layoutManager = LinearLayoutManager(this)
        val helper = Helper()
        val queue = Volley.newRequestQueue(this)
        val url = "https://api.privatbank.ua/p24api/exchange_rates?json&date=" + helper.formatDate()

        val stringRequest = StringRequest(Request.Method.GET, url,
            { response ->
                val objectMapper = jacksonObjectMapper()
                objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                val exchangeRecord = objectMapper.readValue<ExchangeRecord>(response)

                rcView.adapter = ExchangeRecyclerViewAdapter(exchangeRecord.exchangeRate)
            },
            {
                val brockenUrl = listOf<DetailRecord>(
                    DetailRecord(
                        "Error",
                        it.localizedMessage!!,
                        0.0,
                        0.0,
                        null,
                        null
                    )
                )
            })

        queue.add(stringRequest)
    }
}