package com.example.firstapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.theme.AccentBlue
import com.example.firstapp.ui.theme.DarkBlue
import java.util.Locale

@Composable
fun Genre(name : String){

    Box(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(100.dp))
            .background(DarkBlue)
            .padding(10.dp, 5.dp)
    ){
        Text(
            text = name.uppercase(Locale.getDefault()),
            color = AccentBlue,
            fontSize = 10.sp,
            fontWeight = FontWeight.Medium
        )
    }
}