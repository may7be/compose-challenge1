package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun PetList(pets: List<Pet>, onDogClick: (Pet) -> Unit = {}) {
    LazyColumn(
        Modifier.background(Color.LightGray),
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        items(pets) { pet ->
            PetItem(
                pet,
                Modifier
                    .clickable {
                        onDogClick(pet)
                    }
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun PetItem(pet: Pet, modifier: Modifier = Modifier) {
    Card(modifier, backgroundColor = Color.White) {
        Row {
            Image(
                painterResource(pet.picture),
                "Pet(${pet.name})'s photo",
                Modifier.size(180.dp, 140.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(8.dp)) {
                Text(pet.name, style = MaterialTheme.typography.h4)
                Text(pet.age + ", " + pet.gender)
            }
        }
    }
}
