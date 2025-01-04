package com.example.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipeapp.ui.theme.RecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecipeAppTheme {

                    RecipeGen()

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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    RecipeAppTheme {
        RecipeGen()
    }
}

@Composable
fun RecipeGen()
{
    //Greeting(
       // name = "Android",
        //modifier = Modifier.padding(innerPadding)
    //)

    Column(
        modifier = Modifier.padding(50.dp).fillMaxSize()
    ) {
        Column(modifier = Modifier.padding(30.dp).fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            )
        {
            Text(text = "Recipe Generator",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace
                )

            Spacer(modifier = Modifier.padding(50.dp))



        }
        Card(modifier = Modifier.padding(10.dp).fillMaxWidth().height(200.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFD8C0AC),
                contentColor = Color.Black),

            )
        {

        }
    }
}