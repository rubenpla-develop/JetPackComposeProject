package com.rubenpla.jetpackcomposeproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import com.rubenpla.jetpackcomposeproject.extensions.constraintlayout.linkConstraintTo

@Composable
fun ConstraintLayoutExample() {


    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxGray, boxDarkGray, boxBlue, boxMagenta) = createRefs()

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Gray)
            .constrainAs(boxGray) {
                //standard "boilerplate" implementation
                /*top.linkTo(parent.top)
            start.linkTo(parent.start)
            bottom.linkTo(parent.bottom)
            end.linkTo(parent.end)*/

                linkConstraintTo(
                    this,
                    top = parent.top,
                    bottom = parent.bottom,
                    start = parent.start,
                    end = parent.end
                )
            })
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.DarkGray)
            .constrainAs(boxDarkGray) {
                linkConstraintTo(
                    this,
                    start = boxBlue.end,
                    end = boxMagenta.start,
                    bottom = boxBlue.top
                )
            })
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue) {
                linkConstraintTo(
                    this,
                    bottom = boxGray.top,
                    end = boxGray.start
                )
            })
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Magenta)
            .constrainAs(boxMagenta) {
                linkConstraintTo(
                    this,
                    bottom = boxGray.top,
                    start = boxGray.end
                )
            })
    }
}

@Composable
fun ConstraintExampleGuide() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val boxRed = createRef()
        val topGuide = createGuidelineFromTop(0.03f)
        val startGuide = createGuidelineFromStart(0.05f)
        //val topGuide = createGuidelineFromTop(0.05f)
        //val topGuide = createGuidelineFromTop(0.05f)

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                linkConstraintTo(
                    this,
                    top = topGuide,
                    start = startGuide
                )
            })
    }
}

@Composable
fun ConstraintBarrierExample() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxYellow) = createRefs()
        val endBarrier = createEndBarrier(boxRed, boxGreen)

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                start.linkTo(parent.start, margin = 16.dp)
            })

        Box(modifier = Modifier
            .size(225.dp)
            .background(Color.Green)
            .constrainAs(boxGreen) {
                top.linkTo(boxRed.bottom)
                start.linkTo(parent.start, margin = 32.dp)
            })

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                start.linkTo(endBarrier, margin = 8.dp)
            })
    }
}

@Preview
@Composable
fun ConstraintChainExample() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxYellow) = createRefs()

        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                start.linkTo(parent.start)
                end.linkTo(boxGreen.start)
            })

        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Green)
            .constrainAs(boxGreen) {
                start.linkTo(boxRed.end)
                end.linkTo(boxYellow.start)
            })

        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                start.linkTo(boxGreen.end)
                end.linkTo(parent.end)
            })

        createHorizontalChain(boxRed,boxGreen,boxYellow, chainStyle = ChainStyle.SpreadInside)
    }
}