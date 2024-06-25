package com.example.jetpack_compose_androidapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        TextInput()

        }
    }
}

@Composable
fun UseCard() {
    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()
            .wrapContentWidth()


    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth()
                .padding(12.dp)
                .padding(12.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )

            Column(

            ) {

                Text(text = stringResource(id = R.string.dummy_text))
                Button(onClick = {
                    // perform button action here!
                }) {
                    Text(text = "View Profile")
                }
            }
        }
    }


}

@Composable
fun Title() {
    val context = LocalContext.current
    Text(
        text = "Dayam Nadeem",
        fontSize = 32.sp,
        color = colorResource(id = R.color.purple_200),
        fontFamily = FontFamily.Cursive,
        modifier = Modifier.clickable {
            Toast.makeText(context, "Tittle Clicked", Toast.LENGTH_LONG).show()
        }


    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
    }
    Column {
        ListViewtwo(R.drawable.image ,"Dayam Nadeem" ,"Software Develpoer")
        ListViewtwo(R.drawable.image ,"Cool Dz" ,"Software Develpoer")

        ListViewtwo(R.drawable.image ,"Dayam Nadeem" ,"Software Develpoer")
        ListViewtwo(R.drawable.image ,"Dayam Nadeem" ,"Software Develpoer")
        ListViewtwo(R.drawable.image ,"Dayam Nadeem" ,"Software Develpoer")
        ListViewtwo(R.drawable.image ,"Dayam Nadeem" ,"Software Develpoer")
    }




}

@Composable
//list view
fun UserList(){
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        for (i in 1..10){
            UseCard()
        }

    }
}

@Composable
fun TextInput(){
    val state = remember {
        mutableStateOf("")
    }

    TextField(value = state.value,
        onValueChange ={
            state.value = it
        },
        label = {Text(text = "Enter the message ")}
        
    )
}

@Preview(showBackground = true , widthDp = 300 , heightDp = 500)
@Composable
private fun PreviewFunction(){

}
@Composable
fun ListViewtwo(imgId :Int , name :String ,occupation : String){
Row (Modifier.padding(8.dp)){
    Image(painter = painterResource(imgId), contentDescription =null,
        Modifier.size(80.dp))
    Column() {
        Text(text = name
            , fontWeight = FontWeight.Bold)
        Text(text = occupation
            ,
            fontSize = 12.sp)
    }
}
}


