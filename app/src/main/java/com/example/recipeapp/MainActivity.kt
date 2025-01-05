package com.example.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
        modifier = Modifier.padding(25.dp).fillMaxSize()
    ) {
        Column(modifier = Modifier.padding(1.dp).fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            )
        {
            Spacer(modifier = Modifier.padding(35.dp))
            Text(text = "Let's get cooking,",
                textAlign = TextAlign.Center,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
                )
            Text(text = "Jordan",
                textAlign = TextAlign.Center,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            )

            Spacer(modifier = Modifier.padding(35.dp))



        }
        Box(modifier = Modifier.padding(10.dp).fillMaxWidth().height(500.dp),
            )
        {
            Card(
                modifier = Modifier.padding(10.dp).fillMaxWidth().height(210.dp),
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
                modifier = Modifier.padding(10.dp).fillMaxWidth().height(150.dp),
                shape = RoundedCornerShape(25.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFD8C0AC),
                    contentColor = Color.Black
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)

            )
            {

            }
        }
    }
}