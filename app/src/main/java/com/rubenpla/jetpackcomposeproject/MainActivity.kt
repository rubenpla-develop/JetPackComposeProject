package com.rubenpla.jetpackcomposeproject

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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

                }
            }
        }
    }
}

@Preview(name = "PREVIEW 1",
    heightDp = 50,
    showBackground = true,
    showSystemUi = true,
    apiLevel = 27,
    device = Devices.PIXEL_3A_XL)
@Composable
fun defaultPreview() {
    JetPackComposeProjectTheme {
        MyBox()
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
        Box(modifier = Modifier
            .width(250.dp)
            .height(250.dp)
            .background(Color.DarkGray)
            .verticalScroll(
                rememberScrollState()
            ),
            contentAlignment = Alignment.Center) {
            Text("Default Text")
        }
    }
}

