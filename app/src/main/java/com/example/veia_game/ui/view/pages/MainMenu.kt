package com.example.veia_game.ui.view.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.veia_game.R
import com.example.veia_game.view_model.MainViewModel

@Composable
fun MainMenuScreen(navController: NavController, viewModel: MainViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logo do jogo no centro superior
        Image(
            painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = "Logo do Jogo",
            modifier = Modifier
                .padding(bottom = 32.dp)
        )

        // Botões para modos de jogo
        Button(
            onClick = { navController.navigate("classicGameScreen") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Text(text = "Robot Mode (soon)")
        }
        Button(
            onClick = { navController.navigate("teste") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Text(text = "Classic Mode")
        }
        Button(
                onClick = { navController.navigate("Infinity") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
        ) {
        Text(text = "Infinity Mode")
    }
    }
}
