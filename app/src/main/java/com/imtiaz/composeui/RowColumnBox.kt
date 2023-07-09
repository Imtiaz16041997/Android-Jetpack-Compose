package com.imtiaz.composeui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun ColumnBasicLayoutComposable(){

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Text1", fontSize = 24.sp)
        Text(text = "Text2", fontSize = 24.sp)
    }


}


@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun RowBasicLayoutComposable(){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Text(text = "Text1", fontSize = 24.sp)
        Text(text = "Text2", fontSize = 24.sp)
    }


}

@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun BoxBasicLayoutComposable(){
    Box(contentAlignment = Alignment.TopEnd) {
//        Text(text = "Text1", fontSize = 24.sp)
//        Text(text = "Text2", fontSize = 24.sp)
        Image(painter = painterResource(id = R.drawable.heart), contentDescription = "")
        Image(painter = painterResource(id = R.drawable.arrow), contentDescription = "" )
    }


}


/*Using Row Column and Box for design a Item layout*/
@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun ListViewItemUI() {

    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.flash),
            contentDescription = "",
            Modifier.size(40.dp)
        )

        Column() {
            Text(
                text = "Flash",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Software Engineer",
                fontSize = 14.sp,
                fontWeight = FontWeight.Thin
            )

        }

    }
}


/*Using Row Column and Box for design a
Item layout also making this as parameterized function*/


@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun ByDefaultPreview(){
    ListViewItemUIParameterized(R.drawable.flash,"Imtiaz","SE")
}

@Composable
fun ListViewItemUIParameterized(imgID: Int,name:String,profession:String) {

    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imgID),
            contentDescription = "",
            Modifier.size(40.dp)
        )

        Column() {
            Text(
                text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = profession,
                fontSize = 14.sp,
                fontWeight = FontWeight.Thin
            )

        }

    }
}