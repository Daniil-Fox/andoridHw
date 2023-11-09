package com.example.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.components.CreateButton

import com.example.firstapp.ui.components.DotaHeader
import com.example.firstapp.ui.components.Genre
import com.example.firstapp.ui.components.Review
import com.example.firstapp.ui.components.ScreenCard
import com.example.firstapp.ui.components.Title


import com.example.firstapp.ui.theme.BlackDeep
import com.example.firstapp.ui.theme.LightWhite


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            DotaMain()
        }
    }
}
@Composable
fun DotaMain(){

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(BlackDeep)
            .padding(bottom = 140.dp)
    ) {
        item {
            DotaHeader()
        }
        item {
            Column(modifier = Modifier.padding(horizontal = 24.dp)){
                Title()
            }

        }
        item {
            Column(modifier = Modifier.padding(start = 24.dp)){
                LazyRow(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                    item {
                        Genre("MOBA")
                    }
                    item {
                        Genre("MULTIPLAYER")
                    }
                    item {
                        Genre("STRATEGY")
                    }

                }
            }

        }
        item {
            Column(modifier = Modifier.padding(horizontal = 24.dp)){
                Text(
                    text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                    color = LightWhite,
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    modifier = Modifier.padding(PaddingValues(top = 30.dp, bottom = 15.dp))
                )
            }

        }
        item {
            Column(modifier = Modifier.padding(horizontal = 24.dp)){
                LazyRow(horizontalArrangement = Arrangement.spacedBy(15.dp)) {
                    item {
                        ScreenCard(R.drawable.card01, "01")
                    }
                    item {
                        ScreenCard(R.drawable.card02, "02")
                    }
                }
            }

        }
        item {
            Column(modifier = Modifier.padding(horizontal = 24.dp)){
                Box(modifier = Modifier.padding(top = 20.dp)){
                    Review()
                }
            }

        }


    }
    Column(modifier = Modifier.padding(horizontal = 24.dp)){
        CreateButton(
            verticalPadding = 20.dp,
            borderRadius = 12.dp,
        )
    }

}




@Preview
@Composable
fun PreviewDotaMain(){
    DotaMain()
}