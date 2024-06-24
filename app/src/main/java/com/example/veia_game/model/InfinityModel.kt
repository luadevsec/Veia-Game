package com.example.veia_game.model


class InfinityModel {
    private val _board = MutableList(3) { MutableList(3) { GameCell() } }
    private val movesX = mutableListOf<Pair<Int, Int>>()
    private val movesO = mutableListOf<Pair<Int, Int>>()
    var currentPlayer = Player.X
        private set

    fun getBoard(): List<List<GameCell>> = _board

    fun makeMove(row: Int, column: Int): Boolean {
        if (_board[row][column].player == Player.NONE) {
            _board[row][column] = GameCell(currentPlayer)
            trackMove(row, column)
            currentPlayer = if (currentPlayer == Player.X) Player.O else Player.X
            return true
        }
        return false
    }

    private fun trackMove(row: Int, column: Int) {
        val moves = if (currentPlayer == Player.X) movesX else movesO
        moves.add(row to column)
        if (moves.size > 3) {
            val (oldRow, oldCol) = moves.removeAt(0)
            _board[oldRow][oldCol] = GameCell(Player.NONE)
        }
    }

    fun checkWinner(): Player {
        // Verifica linhas e colunas
        for (i in 0..2) {
            if ((_board[i][0].player == _board[i][1].player && _board[i][1].player == _board[i][2].player && _board[i][0].player != Player.NONE) ||
                (_board[0][i].player == _board[1][i].player && _board[1][i].player == _board[2][i].player && _board[0][i].player != Player.NONE)) {
                return _board[i][i].player
            }
        }
        // Verifica diagonais
        if ((_board[0][0].player == _board[1][1].player && _board[1][1].player == _board[2][2].player && _board[0][0].player != Player.NONE) ||
            (_board[0][2].player == _board[1][1].player && _board[1][1].player == _board[2][0].player && _board[0][2].player != Player.NONE)) {
            return _board[1][1].player
        }
        return Player.NONE
    }

    fun resetGame() {
        for (row in _board.indices) {
            for (col in _board[row].indices) {
                _board[row][col] = GameCell()
            }
        }
        movesX.clear()
        movesO.clear()
        currentPlayer = Player.X
    }
}
