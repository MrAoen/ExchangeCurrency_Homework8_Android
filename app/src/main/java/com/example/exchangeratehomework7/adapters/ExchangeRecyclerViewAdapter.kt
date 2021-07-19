package com.example.exchangeratehomework7.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangeratehomework7.R
import com.example.exchangeratehomework7.entity.DetailRecord

class ExchangeRecyclerViewAdapter(private val list: List<DetailRecord>) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        list[position].apply {
            holder.title.text = "$baseCurrency ->  $currency"
            holder.subTitle.text = "Sale: $saleRateNB Purchase: $purchaseRateNB"
        }
    }

    override fun getItemCount() = list.size

}

