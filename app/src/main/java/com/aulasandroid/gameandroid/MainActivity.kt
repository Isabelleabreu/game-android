package com.aulasandroid.gameandroid

import android.R.attr.contentDescription
import android.R.attr.fontFamily
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.gameandroid.ui.theme.GameAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GameAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PlayGameScreen(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun PlayGameScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color.Black)
            .fillMaxSize(),
    ) {
        Column() {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "SCORE: 0050",
                    color = Color.White)
            }


        }
        Column() {
            // jogador

            Text(text = "PRESS START")
        }
    }


}

@Composable
fun AndroidIcon(modifier: Modifier = Modifier, color: Color, size: Dp) {

    Image(
        contentDescription = "Android Icon",
        painter = painterResource(id = R.drawable.ic_android_black_24dp),
        colorFilter = ColorFilter.tint(color),
        modifier = modifier.size(size)
    )
}


//@Composable
//fun EnemiesLine(){
//    Row(
//        modifier = Modifier,
//        .fillMaxWidtch(),
//        horizontalArragement()
//    ) {
//        Text(text = "LIVES:",
//            color = Color.White)
//
//        AndroidIcon(color = Color.Blue, size = 60.dp)
//        AndroidIcon(color = Color.Blue, size = 60.dp)
//        AndroidIcon(color = Color.Blue, size = 60.dp)
//    }
//}
//
//
//@Composable
//fun GameOverScreen(modifier: Modifier = Modifier) {
//    Box(
//        modifier = Modifier
//            .background(Color.Black)
//            .fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ){
//
//        Row(
//
//        )
//    ) {
//        Text(
//            text = "Game over",
//            color = Color.White,
//            fontSize = 45.sp
//        )
//
//        Row() {
//            AndroidIcon(color = Color.Blue, size = 60.dp)
//            AndroidIcon(color = Color.Blue, size = 60.dp)
//            AndroidIcon(color = Color.Blue, size = 60.dp)
//            AndroidIcon(color = Color.Blue, size = 60.dp)
//            AndroidIcon(color = Color.Blue, size = 60.dp)
//
//        }
//    }
//}

