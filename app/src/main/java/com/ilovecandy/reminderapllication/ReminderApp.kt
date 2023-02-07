package com.ilovecandy.reminderapllication

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ilovecandy.reminderapllication.ui.home.Home
import com.ilovecandy.reminderapllication.ui.profile.ChangePass
import com.ilovecandy.reminderapllication.ui.profile.EditProfile
import com.ilovecandy.reminderapllication.ui.profile.Profile
import com.ilovecandy.reminderapllication.ui.welcome.Login
import com.ilovecandy.reminderapllication.ui.welcome.SignUpData
import com.ilovecandy.reminderapllication.ui.welcome.SignUpInfo
import com.ilovecandy.reminderapllication.ui.welcome.Welcome

@Composable
fun ReminderApp(
    appState: ReminderAppState = rememberReminderAppState()
) {
    NavHost(
        navController = appState.navController,
        startDestination = "welcome"
    ) {
        composable(route = "welcome") {
            Welcome(
                modifier = Modifier.fillMaxSize(),
                navController = appState.navController,
            )
        }
        composable(route = "sign in") {
            Login(
                modifier = Modifier.fillMaxSize(),
                navController = appState.navController,
            )
        }
        composable(route = "sign up") {
            SignUpInfo(
                modifier = Modifier.fillMaxSize(),
                navController = appState.navController,
            )
        }
        composable(route = "sign up next") {
            SignUpData(
                modifier = Modifier.fillMaxSize(),
                navController = appState.navController
            )
        }
        composable(route = "home") {
            Home(
                modifier = Modifier.fillMaxSize(),
                navController = appState.navController
            )
        }
        composable(route = "profile") {
            Profile(
                modifier = Modifier.fillMaxSize(),
                navController = appState.navController
            )
        }
        composable(route = "edit profile") {
            EditProfile(
                modifier = Modifier.fillMaxSize(),
                navController = appState.navController
            )
        }
        composable(route = "change pass") {
            ChangePass(
                modifier = Modifier.fillMaxSize(),
                navController = appState.navController
            )
        }
    }
}