package com.example.veia_game.ui.view.components

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.geometry.Offset

class Grade {
    @Composable
    fun Draw(modifier: Modifier = Modifier) {
        Canvas(modifier = modifier) {
            val boardSize = size.minDimension
            val lineThickness = 10f

            // Desenha as duas linhas verticais
            for (i in 1..2) {
                drawLine(
                    color = Color.Black,
                    start = Offset(x = i * boardSize / 3, y = 0f),
                    end = Offset(x = i * boardSize / 3, y = boardSize),
                    strokeWidth = lineThickness
                )
            }

            // Desenha as duas linhas horizontais
            for (i in 1..2) {
                drawLine(
                    color = Color.Black,
                    start = Offset(x = 0f, y = i * boardSize / 3),
                    end = Offset(x = boardSize, y = i * boardSize / 3),
                    strokeWidth = lineThickness
                )
            }
        }
    }
}

