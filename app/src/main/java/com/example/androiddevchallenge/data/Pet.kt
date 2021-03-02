package com.example.androiddevchallenge

import androidx.annotation.DrawableRes

data class Pet(
    val name: String,
    val age: String,
    val gender: String,
    val location: String,
    val desc: String,
    @DrawableRes val picture: Int,
)
