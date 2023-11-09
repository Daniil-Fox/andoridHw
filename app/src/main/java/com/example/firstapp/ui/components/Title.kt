package com.example.firstapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.R
import com.example.firstapp.ui.theme.LightBlue

@Composable
fun Title(){
    Row(
        modifier = Modifier
            .offset(0.dp,(-16).dp),

        verticalAlignment = Alignment.Bottom,

        ) {
        Box(
            modifier = Modifier
                .size(88.dp)
                .background(Color.Black, shape = RoundedCornerShape(16.dp))
                .border(width = 2.dp, LightBlue, shape = RoundedCornerShape(16.dp))
                .padding(17.dp),

            ){
            Image(
                painter = painterResource(R.drawable.dotalogo),
                contentDescription = "Dota logo",
                modifier = Modifier.fillMaxSize()
            )
        }
        Column(
            modifier = Modifier
                .padding(PaddingValues(start = 12.dp, bottom = 8.dp))
        ){
            Text(
                text = "DoTA 2",
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.sk_modernist_bold, FontWeight.Bold)),
                fontSize = 20.sp,

                )
            Row(
                modifier = Modifier
                    .padding(PaddingValues(top = 7.dp)),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.raiting),
                    contentDescription = "Dota logo",
                    modifier = Modifier
                        .height(12.dp)
                        .padding(PaddingValues(end = 10.dp)),
                    contentScale = ContentScale.FillHeight,

                    )
                Text(
                    text = "70 M",
                    color = Color(0xFF45454D),
                    fontFamily = FontFamily(Font(R.font.sk_modernist_regular, FontWeight.Normal))
                )
            }
        }
    }
}
