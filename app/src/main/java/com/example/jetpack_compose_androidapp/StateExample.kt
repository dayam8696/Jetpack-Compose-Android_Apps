package com.example.jetpack_compose_androidapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun NotificationScreen(){
    var count : MutableState<Int> = remember { mutableStateOf(0) }
    Column(

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        NotificationCounter(count.value) { count.value++ }
        MessageBar(count.value)
    }

}
@Composable
fun NotificationCounter(count: Int, increment: () -> Int) {

    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "You have sent $count notification")
        Button(onClick ={increment()}) {
            Text(text ="Send Notification" )
        }

    }
}

@Composable
fun MessageBar(count: Int) {
    Card(elevation = CardDefaults.cardElevation(4.dp)) {
            Row (modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically){
                Image(imageVector = Icons.Outlined.Favorite, contentDescription = " ")
                Text(text = "Message Sent so far - $count")
            }
    }
}