package com.example.veia_game

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.veia_game.ui.theme.MyApplicationTheme
import com.example.veia_game.ui.view.pages.ClassicScreen
import com.example.veia_game.ui.view.pages.InfinityScreen
import com.example.veia_game.ui.view.pages.MainMenuScreen
import com.example.veia_game.ui.view.pages.TesteScreen
import com.example.veia_game.view_model.MainViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "menuScreen") {
                    composable("menuScreen") {
                        MainMenuScreen(navController = navController, viewModel = viewModel)
                    }
                    composable("classicGameScreen") {
                        ClassicScreen()
                    }
                    composable("teste") {
                        TesteScreen()
                    }
                    composable("Infinity") {
                        InfinityScreen()
                    }
                }
            }
        }
    }
}
