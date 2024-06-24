package com.example.veia_game.view_model

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.example.veia_game.model.InfinityModel
import com.example.veia_game.model.Player
import com.example.veia_game.model.GameCell

class InfinityViewModel : ViewModel() {
    private val model = InfinityModel()
    private val _boardState = MutableStateFlow(model.getBoard())
    val boardState: StateFlow<List<List<GameCell>>> = _boardState

    private val _currentPlayer = MutableStateFlow(model.currentPlayer)
    val currentPlayer: StateFlow<Player> = _currentPlayer

    private val _winner = MutableStateFlow(Player.NONE)
    val winner: StateFlow<Player> = _winner

    fun makeMove(row: Int, column: Int) {
        if (model.makeMove(row, column)) {
            _boardState.value = model.getBoard()
            _currentPlayer.value = model.currentPlayer
            _winner.value = model.checkWinner()
        }
    }

    fun resetGame() {
        model.resetGame()
        _boardState.value = model.getBoard()
        _currentPlayer.value = model.currentPlayer
        _winner.value = Player.NONE
    }
}
