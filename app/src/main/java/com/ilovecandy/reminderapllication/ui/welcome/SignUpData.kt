package com.ilovecandy.reminderapllication.ui.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ilovecandy.reminderapllication.ui.theme.LightGrey
import kotlinx.coroutines.launch

@Composable
fun SignUpData(
    modifier: Modifier,
    navController: NavController,
    //viewModel: SignUpViewModel = viewModel(),
){
    val coroutineScope = rememberCoroutineScope()
    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Column(
        modifier = modifier.background(LightGrey),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
    ){
        Text(
            text = "CREATE ACCOUNT",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp),
            value = username.value,
            onValueChange = { text -> username.value = text },
            label = {Text(text = "Username")},
            colors = TextFieldDefaults.textFieldColors(backgroundColor = LightGrey),
        )

        Spacer(modifier = Modifier.height(30.dp))

        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp),
            value = password.value,
            onValueChange = { text -> password.value = text },
            label = {Text(text = "Password")},
            colors = TextFieldDefaults.textFieldColors(backgroundColor = LightGrey),
        )

        Spacer(modifier = Modifier.height(30.dp))

        TextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp),
            value = password.value,
            onValueChange = { text -> password.value = text },
            label = {Text(text = "Confirm Password")},
            colors = TextFieldDefaults.textFieldColors(backgroundColor = LightGrey),
        )

        Spacer(modifier = Modifier.height(80.dp))

        Button(
            onClick = {
//                coroutineScope.launch {
//                    viewModel.saveAccount(
//                        com.ilovecandy.reminderapllication.datastore.entity.Account(
//                            username = username.value,
//                            password = password.value,
//                        )
//                    )
//                }
                navController.navigate("home")
                      },
            modifier = Modifier.height(50.dp).fillMaxWidth(),
            shape = RoundedCornerShape(corner = CornerSize(20.dp))
        ) {
            Text (text = "SIGN UP")
        }

    }
}