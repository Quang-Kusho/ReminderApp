package com.ilovecandy.reminderapllication.ui.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.ilovecandy.reminderapllication.ui.theme.LightGrey
import kotlinx.coroutines.launch

@Composable
fun Login(
    modifier: Modifier,
    navController: NavController,
    viewModel: SignUpViewModel = viewModel(),
){
    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    var enabled = remember { mutableStateOf(true)}
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = modifier.background(LightGrey),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
    ){
        Icon(
            painter = rememberVectorPainter(Icons.Filled.Person),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth().size(200.dp),
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
            value = username.value,
            onValueChange = { text -> username.value = text },
            label = {Text(text = "Username")},
            colors = TextFieldDefaults.textFieldColors(backgroundColor = LightGrey),
        )

        Spacer(modifier = Modifier.height(10.dp))

    //viewModel.getPassword(username.value)
        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
            value = password.value,
            onValueChange = { text -> password.value = text },
            label = {Text(text = "password")},
            visualTransformation = PasswordVisualTransformation(),
            colors = TextFieldDefaults.textFieldColors(backgroundColor = LightGrey),
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {
                      },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
            shape = RoundedCornerShape(corner = CornerSize(20.dp))
        ) {
            Text (text = "SIGN IN")
        }

    }
}