package com.example.firstapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun ScreenCard(id : Int, desc : String){
    Box(
        modifier = Modifier
            .width(240.dp)
            .height(135.dp)
    ){
        Image(
            painter = painterResource(id),
            contentDescription = desc,
            modifier = Modifier.fillMaxSize()
        )
    }
}
