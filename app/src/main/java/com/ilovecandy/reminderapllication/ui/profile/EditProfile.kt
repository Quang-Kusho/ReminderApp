package com.ilovecandy.reminderapllication.ui.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ilovecandy.reminderapllication.ui.theme.LightGrey

@Composable
fun EditProfile(
    modifier: Modifier,
    navController: NavController,
){
    val name = remember { mutableStateOf("Quang Tran") }
    val age = remember { mutableStateOf("20") }
    val email = remember { mutableStateOf("ttquang0511@gmail.com") }

    Column(
        modifier = modifier.background(LightGrey),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
    ){
        Text(
            text = "EDIT PROFILE",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp),
            value = name.value,
            onValueChange = { text -> name.value = text },
            label = {Text(text = "Name")},
            colors = TextFieldDefaults.textFieldColors(backgroundColor = LightGrey),
        )

        Spacer(modifier = Modifier.height(30.dp))

        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp),
            value = age.value,
            onValueChange = { text -> age.value = text },
            label = {Text(text = "Age")},
            colors = TextFieldDefaults.textFieldColors(backgroundColor = LightGrey),
        )

        Spacer(modifier = Modifier.height(30.dp))

        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp),
            value = email.value,
            onValueChange = { text -> email.value = text },
            label = {Text(text = "Email")},
            colors = TextFieldDefaults.textFieldColors(backgroundColor = LightGrey),
        )

        Spacer(modifier = Modifier.height(80.dp))

        Button(
            onClick = { navController.navigate("profile") },
            modifier = Modifier.height(50.dp).fillMaxWidth(),
            shape = RoundedCornerShape(corner = CornerSize(20.dp))
        ) {
            Text (text = "CONFIRM")
        }

    }
}