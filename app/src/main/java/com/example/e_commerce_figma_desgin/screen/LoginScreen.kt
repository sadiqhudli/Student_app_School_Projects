package com.example.e_commerce_figma_desgin.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ClearAll
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.e_commerce_figma_desgin.Compount.MyReusableOutlinedButton
import com.example.e_commerce_figma_desgin.Compount.MyReusableTextSubHeading
import com.example.e_commerce_figma_desgin.Navigation.Screens


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController){

    var loginEmail by remember{ mutableStateOf("email") }

    var loginPassword by remember{ mutableStateOf("") }


    Column(modifier = Modifier.fillMaxSize()
        .padding(top = 100.dp, bottom = 20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        MyReusableTextSubHeading(value = "SignUp")

        Spacer(modifier = Modifier.heightIn(20.dp))

        OutlinedTextField(modifier = Modifier.fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp),
            value = loginEmail,
            onValueChange ={loginEmail=it} ,
            label = { MyReusableTextSubHeading(value = "email") },
            trailingIcon = { Icon(Icons.Default.ClearAll,
                contentDescription = null) },
            leadingIcon = { Icon( Icons.Default.Person,
                tint = Color.Black
                , contentDescription ="" )})

        Spacer(modifier = Modifier.heightIn(20.dp))

        OutlinedTextField(modifier = Modifier.fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp),
            value = loginPassword,
            onValueChange ={loginPassword=it} ,
            label = { MyReusableTextSubHeading(value = "password") },
            leadingIcon = { Icon(Icons.Outlined.Lock,
                tint = Color.Black,
                contentDescription = null) },
            trailingIcon = { Icon(
                Icons.Outlined.VisibilityOff,
                contentDescription = null) })
        Spacer(modifier = Modifier.heightIn(20.dp))

        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(start = 200.dp, end = 20.dp),
            verticalAlignment = Alignment.Bottom){
            TextButton(onClick = { navController.navigate(Screens.LoginScreen.route)}) {

                MyReusableTextSubHeading(value = "Forgot your password?")
            }

        }

        Spacer(modifier = Modifier.heightIn(20.dp))

        MyReusableOutlinedButton(buttonName = "Login",
            onClickButton = {navController.navigate(Screens.HomeScreen.route)})
            



    }


}



@Composable
@Preview(showBackground = true)
fun LoginPreview(){



}