package com.example.firstapp.ui.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.R

@Composable
fun CreateButton(
    text : String = "Install",
    verticalPadding : Dp,
    horizontalPadding : Dp = 0.dp,
    borderRadius : Dp = 5.dp,
    interactionSource: MutableInteractionSource =
        remember { MutableInteractionSource() },
){

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 38.dp),
        contentAlignment = Alignment.BottomCenter
    ){
        Button(
            onClick = {},
            interactionSource = interactionSource,
            shape = RoundedCornerShape(borderRadius),
            colors = ButtonDefaults.buttonColors(Color(0xFFF4D144)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = verticalPadding, horizontal = horizontalPadding)

        ) {
            Text(
                text = text,
                color = Color(0xFF050B18),
                fontSize = 20.sp,
                style = TextStyle(letterSpacing = 0.6.sp),
                fontFamily = FontFamily(Font(R.font.sk_modernist_bold, FontWeight.Bold))
            )
        }


    }

}
