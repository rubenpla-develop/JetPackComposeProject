package com.rubenpla.jetpackcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rubenpla.jetpackcomposeproject.ui.theme.JetPackComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    stateExample()
                }
            }
        }
    }
}

@Composable
fun stateExample() {
    var counter = remember {
        mutableStateOf(0)
    }

    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Button(onClick = { counter.value += 1 }) {
            Text(text = "Pulsar")
        }

        Text(text = "He sido usado ${counter.value} veces")

    }
}

@Preview(name = "PREVIEW 1",
    showBackground = true,
    showSystemUi = true,
    apiLevel = 33,
    device = Devices.PIXEL_3A_XL)
@Composable
fun defaultPreview() {
    JetPackComposeProjectTheme {
        Column {
            stateExample()
            //MyComplexLayout()
            //MyColumn()
            //MyBox()
        }
    }
}

@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {

            Text(text = "Box 2 Text")
        }

        generateSpacer(heightSize = 150)

        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.DarkGray)
        ) {

            Box(
                Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {

                Text(text = "Box 2 Text")
            }
            Box(
                Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {

                Text(text = "Box 2 Text")
            }
        }

        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.LightGray),
            contentAlignment = Alignment.BottomCenter
        ) {

            Text(text = "Box 2 Text")
        }
    }
}

@Composable
fun generateSpacer(widthSize: Int = 0, heightSize : Int = 0) {
    Spacer(modifier = Modifier
        .width(widthSize.dp)
        .height(heightSize.dp))
}

@Composable
fun MyColumn() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Gray))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Red))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Gray))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Red))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Gray))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Gray))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Gray))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Gray))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
    }
}

@Composable
fun MyRow() {
    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())
    ) {

        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Gray))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Red))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Gray))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Red))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Gray))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Gray))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Gray))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
        Text("Text 1", modifier = Modifier.background(Color.Gray))
        Text("Text 2", modifier = Modifier.background(Color.LightGray))
        Text("Text 3", modifier = Modifier.background(Color.Gray))
        Text("Text 4", modifier = Modifier.background(Color.LightGray))
        Text("Text 5", modifier = Modifier.background(Color.Gray))
        Text("Text 6", modifier = Modifier.background(Color.LightGray))
    }
}

@Composable
fun MyBox() {
    /*Text("Default Text", modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .clickable {
            Toast
                .makeText(
                    LocalContext as Activity,
                    "Clickable Compose!!",
                    Toast.LENGTH_LONG
                )
                .show()
        })*/

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(250.dp)
                .height(250.dp)
                .background(Color.DarkGray)
                .verticalScroll(
                    rememberScrollState()
                ),
            contentAlignment = Alignment.Center
        ) {
            Text("Default Text")
        }
    }

}

