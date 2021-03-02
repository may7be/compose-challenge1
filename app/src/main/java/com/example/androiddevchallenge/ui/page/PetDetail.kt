package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun PetDetail(pet: Pet) {
    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.secondary)
    ) {
        Box {
            Image(
                painterResource(pet.picture),
                "Pet picture: ${pet.name}",
                Modifier.aspectRatio(1f),
                contentScale = ContentScale.Crop
            )
        }
        Column(Modifier.padding(16.dp, 8.dp)) {
            Text("Name: ${pet.name}", style = MaterialTheme.typography.h3)
            ProvideTextStyle(MaterialTheme.typography.h5) {
                Text("小名: ${pet.desc}")
                Text("Location: ${pet.location}")
                Text("Age: ${pet.age}")
                Text("Gender: ${pet.gender}")
            }
        }
    }
}
