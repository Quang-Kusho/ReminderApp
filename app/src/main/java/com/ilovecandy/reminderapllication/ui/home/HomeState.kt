package com.ilovecandy.reminderapllication.ui.home

import androidx.navigation.NavHostController

class HomeState(
    val navController: NavHostController
) {
    fun navigateBack() {
        navController.popBackStack()
    }
}