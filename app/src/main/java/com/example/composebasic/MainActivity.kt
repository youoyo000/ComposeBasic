package com.example.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasic.ui.theme.ComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "李宥萱",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    var x by remember { mutableStateOf(0) }
//
    Column {
        Row {
            Text(text = x.toString(),
                color = Color.Blue,
                fontSize = 30.sp,
                modifier = modifier.clickable{x=x+1})
Column {
            Button(
                modifier = modifier,
                onClick = {
                    x = 0
                }
            ) {
                Text("歸零")
                Image(
                    painter = painterResource(id = R.drawable.minions),
                    contentDescription = "minions照片",

                )
            }
            Button(
                modifier = modifier,
                onClick = {
                    x *= 2
                }
            ) {
                Text("兩倍")
                Image(
                    painter = painterResource(id = R.drawable.minions),
                    contentDescription = "minions照片",
                    //modifier = modifier.size(50.sp)
                )}
    Image(

        painter = painterResource(id = R.drawable.min),
        contentDescription = "bobobo",
        alpha = 0.8f,
        modifier = Modifier.clip(CircleShape)

    )
            }
            Text(
                text = stringResource(R.string.author),
                color = Color.Blue,
                fontSize = 30.sp,
                fontFamily = FontFamily(Font(R.font.abcd)),
                modifier = modifier
            )


            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.min),
                    contentDescription = "bobobo"

                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeBasicTheme {
        Greeting("Android")
    }
}
