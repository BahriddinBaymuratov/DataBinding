package com.example.databinding.model

import androidx.databinding.ObservableField

data class Employee(
    val id: Int,
    var name:  String, // ObservableField<String>,     name: String
    val address: String,
    val salary: Double,
    val hobbies: List<String>,
    val avatarUrl: String
)
