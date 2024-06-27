package com.example.jetpack_compose_androidapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun PreviweItem(){
 LazyColumn{
     items(getCategoryList()){ item ->
         BlogCategory(img = item.img, Tittle = item.tittle, Subtitle = item.subtitle)

     }
 }
}

@Composable
fun BlogCategory (img : Int , Tittle:String , Subtitle : String){
    Card(elevation =CardDefaults.cardElevation(8.dp), modifier = Modifier.padding(8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(18.dp)) {
            Image(painter = painterResource(id = img), contentDescription = "",
                modifier = Modifier
                    .size(60.dp)
                    .padding(8.dp)
                    .weight(.2f)





            )
            ItemDiscription(Tittle, Subtitle ,Modifier.weight(.8f))
        }

    }

}

@Composable
 fun ItemDiscription(Tittle: String, Subtitle: String , modifier: Modifier) {

    Column(modifier = modifier) {
        Text(
            text = Tittle,
            style = MaterialTheme.typography.bodyLarge

        )
        Text(
            text = Subtitle,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp
        )

    }
}

data class Category (
        val img : Int , val tittle :String , val subtitle :String
        )
fun getCategoryList() :MutableList<Category>{
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.image,"Dayam Nadeem" ,"CS Student"))
    list.add(Category(R.drawable.image,"Nadeem" ,"CSe Student"))
    list.add(Category(R.drawable.image,"Abuzar" ,"CS Student"))
    list.add(Category(R.drawable.image,"Ayan" ,"CS Student"))
    list.add(Category(R.drawable.image,"Razique" ,"CS Student"))
    list.add(Category(R.drawable.image,"Haris" ,"CS Student"))
    list.add(Category(R.drawable.image,"Shaad" ,"CS Student"))
    list.add(Category(R.drawable.image,"Numaan" ,"CS Student"))
    list.add(Category(R.drawable.image,"Abuzar" ,"CS Student"))
    list.add(Category(R.drawable.image,"Ayan" ,"CS Student"))
    list.add(Category(R.drawable.image,"Razique" ,"CS Student"))
    list.add(Category(R.drawable.image,"Haris" ,"CS Student"))
    list.add(Category(R.drawable.image,"Shaad" ,"CS Student"))
    list.add(Category(R.drawable.image,"Numaan" ,"CS Student"))
    return list
}