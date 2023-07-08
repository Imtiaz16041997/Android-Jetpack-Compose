package com.imtiaz.composeui


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
//                    UiDesign() //Rows,Columns,basic sizing
                     UIModifierDesign()  //Modifiers
            }
        }
    }


    @Composable
     fun UIModifierDesign() {
        Column(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
//                .padding(top = 16.dp)
                .border(5.dp, Color.Magenta)
                .padding(5.dp)
                .border(5.dp,Color.Cyan)
                .padding(5.dp)
                .border(10.dp,Color.Red)
                .padding(10.dp)
//                .width(600.dp)
//                .requiredWidth(300.dp)
        ) {
////            Text(text = "Hello", modifier = Modifier.offset(0.dp,20.dp)) //offset is basically margin
//            Text(text = "Hello", modifier = Modifier
//                .border(5.dp,Color.Yellow)
//                .padding(5.dp)
//                .offset(20.dp,20.dp)
//                .border(5.dp,Color.DarkGray)
//                .padding(30.dp)
//            )
            Text(text = "Hello", modifier = Modifier.clickable {

            })

            Spacer(modifier = Modifier.height(50.dp))  //space making between text
            Text(text = "World")

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