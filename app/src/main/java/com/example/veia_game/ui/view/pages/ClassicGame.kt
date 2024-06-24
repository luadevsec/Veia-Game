package com.example.veia_game.ui.view.pages

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import com.example.veia_game.ui.view.components.Grade


@Composable
fun ClassicScreen() {
    var clickedCell by remember { mutableStateOf<Pair<Int, Int>?>(null) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(300.dp)
                .background(Color.Cyan)
                .pointerInput(Unit) {
                    detectTapGestures { offset ->
                        val cellSize = size.width / 3
                        val column = (offset.x / cellSize).toInt()
                        val row = (offset.y / cellSize).toInt()
                        clickedCell = row to column
                    }
                },
            contentAlignment = Alignment.Center
        ){
            Grade().Draw(modifier = Modifier.size(300.dp))
        }

        if (clickedCell != null) {
            Text(
                text = "Clicked cell: (${clickedCell!!.first}, ${clickedCell!!.second})",
                color = Color.Black,
                style = MaterialTheme.typography.bodyLarge
            )
        } else {
            Text(
                text = "Crica",
                color = Color.Black,
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

