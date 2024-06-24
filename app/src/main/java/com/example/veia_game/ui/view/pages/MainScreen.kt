package com.example.veia_game.ui.view.pages

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.veia_game.view_model.MainViewModel

@Composable
fun MainScreen(navController: NavController, viewModel: MainViewModel = viewModel()) {
    MainScreenContent(viewModel)
}

@Composable
fun MainScreenContent(viewModel: MainViewModel = viewModel()) {
    val message = viewModel.message.collectAsState()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = message.value, style = MaterialTheme.typography.headlineMedium)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    // MockViewModel para visualização
    val mockViewModel = MainViewModel().apply {
        // Inicialize qualquer estado necessário para o preview aqui
    }
    MainScreenContent(viewModel = mockViewModel)
}
