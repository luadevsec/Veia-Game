package com.example.veia_game

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.veia_game.ui.view.pages.MainScreen
import com.example.veia_game.ui.theme.MyApplicationTheme
import com.example.veia_game.view.Board

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "grade") {
                    composable(
                        route = "testemuie"
                    ){MainScreen(navController)}
                    composable(
                        route = "grade"
                    ){Board(navController)}
                    }
            }
        }
    }
}
