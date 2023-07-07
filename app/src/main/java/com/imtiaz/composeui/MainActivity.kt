package com.imtiaz.composeui


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import com.imtiaz.composeui.ui.theme.ComposeUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUITheme {
                // A surface container using the 'background' color from the theme
                    UiDesign()
            }
        }
    }
}


@Composable
fun UiDesign() {
   Row(
       modifier = Modifier
//           .fillMaxSize()
           .width(300.dp)
           .height(300.dp)
           .fillMaxHeight(0.7f)
           .background(Color.Green),
       /*For Horizontal Row will be Column*/
//       horizontalAlignment = Alignment.CenterHorizontally,
//       verticalArrangement = Arrangement.SpaceEvenly

   /*For Vertical Column will be Row*/
       horizontalArrangement = Arrangement.SpaceEvenly,
       verticalAlignment = Alignment.CenterVertically

   )

   {
       Text(text = "Hello")
       Text(text = "World")
       Text(text = "World")
   }
}