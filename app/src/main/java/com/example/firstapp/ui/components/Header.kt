package com.example.firstapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.firstapp.R

@Composable
fun DotaHeader(){
    Image(
        painter = painterResource(R.drawable.dotaheader),
        contentDescription = "Dota heading",
        modifier = Modifier
            .fillMaxWidth(),
        contentScale = ContentScale.FillWidth
    )
}