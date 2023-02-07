package com.ilovecandy.reminderapllication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ilovecandy.reminderapllication.ui.profile.ChangePass
import com.ilovecandy.reminderapllication.ui.profile.Profile
import com.ilovecandy.reminderapllication.ui.theme.ReminderApllicationTheme
import com.ilovecandy.reminderapllication.ui.welcome.Login
import com.ilovecandy.reminderapllication.ui.welcome.SignUpData
import com.ilovecandy.reminderapllication.ui.welcome.SignUpInfo
import com.ilovecandy.reminderapllication.ui.welcome.Welcome
import com.ilovecandy.reminderapllication.ui.profile.EditProfile

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReminderApllicationTheme {
                // A surface container using the 'background' color from the theme
                Surface( color = MaterialTheme.colors.background) {
                    ReminderApp()
                }
            }
        }
    }
}