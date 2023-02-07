package com.ilovecandy.reminderapllication.ui.welcome

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Welcome(
    modifier: Modifier,
    navController: NavController
){
    // val themeColor = Color.Green
    // val themeConstrastColor = Color.White

    Column(
        modifier = modifier.background(Color.Green),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
    ){
        Spacer(modifier = Modifier.height(50.dp))

        Icon(
            painter = rememberVectorPainter(Icons.Filled.Person),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth().size(200.dp),
        )

        Spacer(modifier = Modifier.height(200.dp))

        Button(
            onClick = { navController.navigate("sign up") },
            modifier = Modifier.fillMaxWidth().height(70.dp),
            shape = RoundedCornerShape(corner = CornerSize(700.dp)),
            border = BorderStroke(1.dp, Color.White),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
        ) {
            Text (text = "SIGN UP", color = Color.White)
        }

        Spacer(modifier = Modifier.height(50.dp))

        Button(
            onClick = { navController.navigate("sign in") },
            modifier = Modifier.fillMaxWidth().height(70.dp),
            shape = RoundedCornerShape(corner = CornerSize(70.dp)),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
        ) {
            Text (text = "SIGN IN", color = Color.Green)
        }

    }
}