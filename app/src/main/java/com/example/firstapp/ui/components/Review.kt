package com.example.firstapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.R
import com.example.firstapp.ui.theme.WhiteColor


@Composable
fun Review(){
    Column {
        Text(
            text = "Review & Ratings",
            fontSize = 16.sp,
            style = TextStyle(letterSpacing = 0.6.sp),
            color = WhiteColor,
            fontFamily = FontFamily(Font(R.font.sk_modernist_bold, FontWeight.Bold))
        )

        Row(verticalAlignment = Alignment.Bottom){
            Text(
                text = "4.9",
                fontSize = 48.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_bold, FontWeight.Bold)),
                color = Color.White
            )
            Column(
                modifier = Modifier

                    .padding(start = 16.dp),
                verticalArrangement = Arrangement.Bottom,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.raiting), contentDescription = "raiting",
                    modifier = Modifier.height(12.dp),
                    contentScale = ContentScale.FillHeight
                )
                Text(
                    text = "70M Reviews",
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist_regular, FontWeight.Normal)),
                    style = TextStyle(letterSpacing = 0.5.sp),
                    color = Color(0xFFA8ADB7),
                    modifier = Modifier.padding(vertical = 7.dp)
                )
            }
        }

        Comment(
            R.drawable.ava01,
            "some person",
            "Auguste Conte",
            "February 14, 2019",
            "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
        Divider(
            modifier = Modifier.padding(start = 14.dp, end = 14.dp),
            thickness = 1.dp,
            color = Color(0xFF1A1F29)
        )
        Comment(
            R.drawable.ava02,
            "some person",
            "Jang Marcelino",
            "February 14, 2019",
            "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    }

}
