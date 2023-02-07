package com.ilovecandy.reminderapllication.ui.profile

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ilovecandy.reminderapllication.ui.theme.LightGrey

@Composable
fun Profile(
    modifier: Modifier,
    navController: NavController,
){

    Column(
        modifier = modifier.background(LightGrey),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
    ){
        Icon(
            painter = rememberVectorPainter(Icons.Filled.Person),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth().size(200.dp),
        )


        Text(
            text = "Profile",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Name: Quang Tran",
            modifier = Modifier.padding(horizontal = 50.dp),
            fontSize = 15.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Age: 20",
            modifier = Modifier.padding(horizontal = 50.dp),
            fontSize = 15.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Email: ttquang0511@gmail.com",
            modifier = Modifier.padding(horizontal = 50.dp),
            fontSize = 15.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Username: quangtranthien",
            modifier = Modifier.padding(horizontal = 50.dp),
            fontSize = 15.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Password: ********",
            modifier = Modifier.padding(horizontal = 50.dp),
            fontSize = 15.sp,
        )

        Spacer(modifier = Modifier.height(50.dp))

        Row(){
            Button(
                onClick = { navController.navigate("edit profile") },
                modifier = Modifier.padding(horizontal = 40.dp),
                shape = RoundedCornerShape(corner = CornerSize(20.dp))
            ) {
                Text (text = "EDIT PROFILE")
            }

            Button(
                onClick = { navController.navigate("change pass") },
                modifier = Modifier.padding(horizontal = 30.dp),
                shape = RoundedCornerShape(corner = CornerSize(20.dp))
            ) {
                Text (text = "CHANGE PASSWORD")
            }
        }
    }
}