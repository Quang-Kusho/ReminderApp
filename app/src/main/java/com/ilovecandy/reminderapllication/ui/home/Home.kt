package com.ilovecandy.reminderapllication.ui.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Home(
    modifier: Modifier,
    navController: NavController,
){
    Column(
        modifier = Modifier
            // .systemBarsPadding()
            .fillMaxWidth()
    ) {
        val appBarColor = MaterialTheme.colors.secondary.copy(alpha = 0.87f)

        HomeAppBar(
            backgroundColor = appBarColor,
            navController = navController,
        )
    }
}

@Composable
private fun HomeAppBar(
    backgroundColor: Color,
    navController: NavController,
) {
    TopAppBar(
        title = {
            Text(
                text = "ReminderApp",
                color = MaterialTheme.colors.primary,
                modifier = Modifier
                    .padding(start = 4.dp)
                    .heightIn(max = 24.dp)
            )
        },
        backgroundColor = backgroundColor,
        actions = {

            IconButton( onClick = { navController.navigate("profile") } ) {
                Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "")
            }
        }
    )
}