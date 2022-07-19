package com.simpleapps.pdfcomposerapplication.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.simpleapps.pdfcomposerapplication.activities.ui.theme.PdfComposerApplicationTheme
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PdfComposerApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }

        Executors.newSingleThreadScheduledExecutor().schedule({
            startActivity(Intent(this, IntroActivity::class.java))
        }, 1,TimeUnit.SECONDS)
    }
}

@Composable
fun Greeting() {
    Icon(Icons.Filled.Warning, contentDescription = null)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PdfComposerApplicationTheme {
        Greeting()
    }
}