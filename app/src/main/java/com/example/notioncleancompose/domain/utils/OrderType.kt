package com.example.notioncleancompose.domain.utils

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}