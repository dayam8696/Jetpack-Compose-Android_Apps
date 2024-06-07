package com.example.jetpack_compose_androidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Text(text = "Hello Dayam")

        }
    }
}
@Preview(showBackground = true , name = "Hello msg", showSystemUi = true)
@Composable
fun Dayam(name:String = "Cool Dayam"){
    Text(text = "Hello $name")
}
