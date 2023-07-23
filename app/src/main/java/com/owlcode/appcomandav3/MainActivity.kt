package com.owlcode.appcomandav3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.owlcode.ui.theme.AppComandaV3Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppComandaV3Theme {
                
            }
        }
    }
}