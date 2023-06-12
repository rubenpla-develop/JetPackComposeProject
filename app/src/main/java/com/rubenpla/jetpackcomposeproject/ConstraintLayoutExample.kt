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
import androidx.constraintlayout.compose.ConstraintLayout
import com.rubenpla.jetpackcomposeproject.extensions.constraintlayout.linkConstraintTo

@Preview
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