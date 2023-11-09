package com.example.firstapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.R

@Composable
fun Comment(
    idImg : Int,
    imgDescr : String,
    name : String,
    date : String,
    content : String
){
    Box(modifier = Modifier
        .padding(top = 25.dp, bottom = 24.dp)
        .fillMaxWidth()
    ){
        Column(verticalArrangement = Arrangement.spacedBy(18.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)){
                Image(
                    painter = painterResource(id = idImg),
                    contentDescription = imgDescr,
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                )
                Column(){
                    Text(
                        text = name,
                        fontSize = 16.sp,
                        style = TextStyle(letterSpacing = 0.5.sp),
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 7.dp),
                        fontFamily = FontFamily(Font(R.font.sk_modernist_regular, FontWeight.Normal)),
                    )
                    Text (
                        text = date,
                        fontSize = 12.sp,
                        style = TextStyle(letterSpacing = 0.5.sp),
                        color = Color(0x66FFFFFF),
                        fontFamily = FontFamily(Font(R.font.sk_modernist_regular, FontWeight.Normal)),
                    )
                }
            }
            Text(
                text = content,
                color = Color(0xFFA8ADB7),
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_regular, FontWeight.Normal)),
                style = TextStyle(letterSpacing = 0.5.sp, lineHeight = 20.sp)
            )
        }

    }
}