package com.example.recipeapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true)
@Composable
fun RecipeOverview()
{
    val navController = rememberNavController()

    Column(modifier = Modifier.padding(100.dp).fillMaxSize())
    {
        Text(text = "Recipe Screen")
    }


}