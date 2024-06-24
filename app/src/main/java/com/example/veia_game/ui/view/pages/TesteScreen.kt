package com.example.veia_game.ui.view.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.veia_game.R
import com.example.veia_game.model.Player
import com.example.veia_game.view_model.TesteViewModel

@Composable
fun TesteScreen(viewModel: TesteViewModel = viewModel()) {
    val board by viewModel.boardState.collectAsState()
    val currentPlayer by viewModel.currentPlayer.collectAsState()
    val winner by viewModel.winner.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = when (winner) {
                Player.NONE -> "Current Player: ${if (currentPlayer == Player.X) "X" else "O"}"
                else -> "Winner: ${winner}"
            },
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Desenho do tabuleiro
        for (row in board.indices) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                for (col in board[row].indices) {
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .background(Color.White)
                            .padding(2.dp)
                            .clickable { viewModel.makeMove(row, col) }
                    ) {
                        when (board[row][col].player) {
                            Player.X -> Image(
                                painter = painterResource(id = R.drawable.xis_defou),
                                contentDescription = "X",
                                modifier = Modifier.fillMaxSize()
                            )
                            Player.O -> Image(
                                painter = painterResource(id = R.drawable.bola_defou),
                                contentDescription = "O",
                                modifier = Modifier.fillMaxSize()
                            )
                            else -> {}
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botão de reset
        Button(onClick = { viewModel.resetGame() }) {
            Text(text = "Reiniciar Jogo")
        }
    }
}

