package com.imtiaz.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

@Preview(showBackground = true, widthDp = 300, heightDp = 300, showSystemUi = true)
@Composable
fun ConstraintLayoutCall(){
    ConstraintLayoutUI()
}

@Composable
fun ConstraintLayoutUI(){
     val constraints = ConstraintSet{
         val greenBox = createRefFor("greenbox")
         val redBox = createRefFor("redbox")
         val guideline = createGuidelineFromTop(0.5f)

         constrain(greenBox){
             top.linkTo(guideline)
             start.linkTo(parent.start)
             width = Dimension.value(100.dp)
             height = Dimension.value(100.dp)
         }
         constrain(redBox){
             top.linkTo(parent.top)
             start.linkTo(greenBox.end)
             end.linkTo(parent.end)
             width = Dimension.value(100.dp)
             height = Dimension.value(100.dp)
         }

         createHorizontalChain(greenBox,redBox, chainStyle = ChainStyle.Packed)
    }

    ConstraintLayout(constraints,modifier = Modifier.fillMaxSize()){
        Box(modifier = Modifier
            .background(Color.Green)
            .layoutId("greenbox"))

        Box(modifier = Modifier
            .background(Color.Red)
            .layoutId("redbox"))
    }
}