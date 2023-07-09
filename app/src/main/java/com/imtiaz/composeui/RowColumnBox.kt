package com.imtiaz.composeui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
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