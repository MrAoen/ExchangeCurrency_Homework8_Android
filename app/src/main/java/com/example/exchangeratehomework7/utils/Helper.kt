package com.example.exchangeratehomework7.utils

import com.example.exchangeratehomework7.App
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Helper {
    fun formatDate() =
        LocalDate.of(App.year, App.month, App.day).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
}