package com.example.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recipeapp.ui.theme.RecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecipeAppTheme {


                val navController = rememberNavController()

                NavHost(navController, startDestination = "recipeGen") {
                    composable("recipeGen") { RecipeGen(navController) }
                    composable("recipeOverview") { RecipeOverview() }

                }
            }
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }


    @Composable
    fun RecipeGen(navController: NavController) {
        Column(
            modifier = Modifier
                .padding(25.dp)
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .padding(1.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Spacer(modifier = Modifier.padding(35.dp))
                Text(
                    text = "Let's get cooking,",
                    textAlign = TextAlign.Center,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif
                )
                Text(
                    text = "Jordan",
                    textAlign = TextAlign.Center,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif
                )

                Spacer(modifier = Modifier.padding(35.dp))


            }
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(500.dp),
            )
            {
                Card(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                        .height(210.dp),
                    shape = RoundedCornerShape(25.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFd1d1d1),
                        contentColor = Color.Black
                    ),
                    elevation = CardDefaults.cardElevation(defaultElevation = 30.dp)

                )
                {

                }

                Card(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                        .height(150.dp),
                    shape = RoundedCornerShape(25.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFD8C0AC),
                        contentColor = Color.Black
                    ),
                    elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)

                )
                {
                    Column(modifier = Modifier.padding(0.dp))
                    {
                            CustomTextField(navController)

                        Button(onClick = {navController.navigate("recipeOverview")},
                            modifier = Modifier.padding(horizontal = 20.dp)
                                .fillMaxWidth().wrapContentHeight(),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF79A96C),
                                contentColor = Color.White,

                            ),
                            shape = RoundedCornerShape(25.dp),



                        ) {
                            Text(text = "Generate Recipe",
                                fontStyle = FontStyle.Italic,
                                color = Color.White.copy(alpha = 0.8f)
                                )
                        }
                    }
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun CustomTextField(navController: NavController) {
        val textState = remember { mutableStateOf(TextFieldValue()) }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp)
                .background(Color(0xFFD8C0AC), shape = RoundedCornerShape(25.dp))

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = textState.value,
                    onValueChange = { textState.value = it },
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 8.dp)
                        .height(52.dp),
                    placeholder = { Text("Enter Ingredients", fontSize = 15.sp,
                        ) },
                    shape = RoundedCornerShape(25.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                        containerColor = Color.White,

                    )
                )
                IconButton(
                    onClick = { navController.navigate("recipeOverview")},
                    modifier = Modifier
                        .size(52.dp)
                        .background(Color(0xFF79A96C), shape = RoundedCornerShape(25.dp)),

                ) {
                    Icon(Icons.Filled.Add, contentDescription = "Add", tint = Color.White)
                }
            }
        }
    }

    @Preview(showBackground = true, device = Devices.PIXEL_4)
    @Composable
    fun RecipeGenPreview() {
        RecipeAppTheme {
            val navController = rememberNavController() // Create a NavController for the preview
            RecipeGen(navController)
        }
    }
}