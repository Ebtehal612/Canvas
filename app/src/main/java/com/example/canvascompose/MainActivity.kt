package com.example.canvascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.canvascompose.ui.theme.CanvasComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           Canvas1()
        }
    }
}

@Composable
fun Canvas1() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawRect(
            color = Color.Cyan,
            size = size,
        )
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(Color.Red,Color.Yellow),
                center = center,
               radius = 200f
            ),
            radius = 200f
        )
        drawOval(
            color = Color.White,
            topLeft = Offset(200f,1600f),
            size= Size(400f,160f)
        )
        drawOval(
            color = Color.White,
            topLeft = Offset(200f,1700f),
            size= Size(600f,190f)
        )
        drawOval(
            color = Color.White,
            topLeft = Offset(700f,1600f),
            size= Size(700f,200f)
        )
        drawOval(
            color = Color.White,
            topLeft = Offset(700f,1750f),
            size= Size(500f,200f)
        )
        drawRect(
            color = Color.Blue,
            topLeft = Offset(0f,2000f),
            size=Size(2000f,1300f)
        )
    }
}


