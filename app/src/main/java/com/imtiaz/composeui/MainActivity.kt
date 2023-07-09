package com.imtiaz.composeui


import android.annotation.SuppressLint
import android.icu.text.LocaleDisplayNames.UiListItem
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.imtiaz.composeui.ui.theme.ComposeUITheme
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContent {
            ComposeUITheme {

//                ColumnBasicLayoutComposable()
//                RowBasicLayoutComposable()
//                BoxBasicLayoutComposable()
//                  ListViewItemUI()
//                ListViewItemUIParameterized(R.drawable.flash,"Imtiaz","SE")
                ByDefaultPreview()
                // A surface container using the 'background' color from the theme
//                    UiDesign() //Rows,Columns,basic sizing
//                     UIModifierDesign()  //Modifiers
//                val painter = painterResource(id = R.drawable.flash)
//                val description = "I'm The Fastest Man Alive"
//                val title = "I'm The Fastest Man Alive"
//                Box(modifier = Modifier
//                    .fillMaxWidth(0.5f)
//                    .padding(16.dp)
//                ){
//                    UIDesignImageCard(painter = painter ,contentDescription = description  ,title = title) //Creating an Image Card Composable
//
//                }

//                val fontFamily = FontFamily(
//                    Font(R.font.josefinslab_medium, FontWeight.Thin),
//                    Font(R.font.josefinslab_light, FontWeight.Light),
//                    Font(R.font.josefinslab_extralight, FontWeight.Normal))
//                UIStylingText(fontFamily) // Styling Text



                /*State*/
                /*Column(Modifier.fillMaxSize()) {
                    val color = remember {
                        mutableStateOf(Color.Yellow)
                    }

                    UIState(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxSize()
                    )
                    {
                        color.value = it
                    }
                    Box(
                        modifier = Modifier
                            .background(color.value)
                            .weight(1f)
                            .fillMaxSize()
                    )

                }
//                UIState(modifier = Modifier.fillMaxSize())*/

                /*Textfields, Buttons & Showing Snackbars*/

//                UITextNButtonNSnackBar()

                /*List*/

//                RecyclerViewNormal() // Normal Column

//                RecyclerViewLazyColumn() // LazyColumn
//                RecyclerViewLazyColumnWithIndex() // LazyColumn

            }
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
            .border(5.dp, Color.Cyan)
            .padding(5.dp)
            .border(10.dp, Color.Red)
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


@Composable
fun UIDesignImageCard(painter: Painter, contentDescription: String, title: String, modifier: Modifier = Modifier)

{
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp

    ) {
        Box(modifier = Modifier.height(200.dp)){
            /*Put an image here*/
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                )

            ){

            }





            /*Top of that image we put a box */
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            )
            /*in that box we have our text*/
            {
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}


@Composable
fun UIStylingText(fontFamily:FontFamily){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF101010))){
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ){
                    append("J")
                }
                append("etpack")
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ){
                    append("C")
                }
                append("ompose")
            },
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline

        )
    }

}

@Composable
fun UIState(modifier: Modifier = Modifier,updateColor: (Color) -> Unit){
//    val color = remember{
//        mutableStateOf(Color.Yellow)
//    }

    Box(
        modifier = modifier
            .background(Color.Red)
            .clickable {
                updateColor(
                    Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        1f
                    )
                )
            }

    ){

    }

}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun UITextNButtonNSnackBar(){

    val scaffoldState = rememberScaffoldState()
    var textFieldState by remember{
        mutableStateOf("")
    }
    val scope = rememberCoroutineScope()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
            ) {
                TextField(
                    value = textFieldState,
                    label = {
                            Text(text = "Enter your Name")
                    },
                    onValueChange = {
                        textFieldState = it
                    },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()

                )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                scope.launch {
                    scaffoldState.snackbarHostState.showSnackbar("Hello $textFieldState")
                }
            }) {
                Text(text = "pls greet me")
            }
        }
    }


}



