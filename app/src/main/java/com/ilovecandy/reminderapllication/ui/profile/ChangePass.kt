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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ilovecandy.reminderapllication.ui.theme.LightGrey
import androidx.navigation.NavController

@Composable
fun ChangePass(
    modifier: Modifier,
    navController: NavController,
){
    val oldPass = remember { mutableStateOf("") }
    val newPass = remember { mutableStateOf("") }
    val confirmPass = remember { mutableStateOf("") }

    Column(
        modifier = modifier.background(LightGrey),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
    ){
        Text(
            text = "CHANGE PASSWORD",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp),
            value = oldPass.value,
            onValueChange = { text -> oldPass.value = text },
            label = {Text(text = "Old Password")},
            visualTransformation = PasswordVisualTransformation(),
            colors = TextFieldDefaults.textFieldColors(backgroundColor = LightGrey),
        )

        Spacer(modifier = Modifier.height(30.dp))

        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp),
            value = newPass.value,
            onValueChange = { text -> newPass.value = text },
            label = {Text(text = "New Password")},
            visualTransformation = PasswordVisualTransformation(),
            colors = TextFieldDefaults.textFieldColors(backgroundColor = LightGrey),
        )

        Spacer(modifier = Modifier.height(30.dp))

        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp),
            value = confirmPass.value,
            onValueChange = { text -> confirmPass.value = text },
            label = {Text(text = "Confirm Password")},
            visualTransformation = PasswordVisualTransformation(),
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