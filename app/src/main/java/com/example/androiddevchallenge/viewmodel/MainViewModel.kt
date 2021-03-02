package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val pets by mutableStateOf(
        listOf(
            Pet(
                "狗001", "1", "Female",
                "四川", "爱跑动", R.drawable.dog1
            ),
            Pet(
                "猫003", "3", "Male",
                "北京", "王子", R.drawable.cat3
            ),
            Pet(
                "狗006", "6", "Female",
                "云南", "一家人", R.drawable.dog6
            ),
            Pet(
                "猫004", "4", "FeMale",
                "上海", "公主", R.drawable.cat4
            ),
            Pet(
                "狗005", "5", "Male",
                "山东", "薰衣草", R.drawable.dog5
            ),
            Pet(
                "狗007", "7", "male",
                "东北", "大聪明", R.drawable.dog7
            ),
            Pet(
                "猫001", "1", "Female",
                "山西", "老大", R.drawable.cat1
            ),
            Pet(
                "狗002", "2", "Male",
                "内蒙", "耐久力好", R.drawable.dog2
            ),

            Pet(
                "狗004", "4", "FeMale",
                "天津", "待不住", R.drawable.dog4
            ),
            Pet(
                "猫002", "2", "Male",
                "重庆", "二哥", R.drawable.cat2
            ),
            Pet(
                "狗003", "3", "Male",
                "河南", "爱跟人玩", R.drawable.dog3
            ),
            Pet(
                "猫005", "5", "Female",
                "杭州", "小可爱", R.drawable.cat5
            )
        )
    )

    var currentPet: Pet? by mutableStateOf(null)

    fun showPet(pet: Pet) {
        currentPet = pet
    }

    fun closePet() {
        currentPet = null
    }
}
