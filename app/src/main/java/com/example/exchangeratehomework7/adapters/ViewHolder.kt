package com.example.exchangeratehomework7.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangeratehomework7.R

class ViewHolder(view :View): RecyclerView.ViewHolder(view){

    val title: TextView = view.findViewById(R.id.title)
    val subTitle: TextView = view.findViewById(R.id.subTitle)
}
