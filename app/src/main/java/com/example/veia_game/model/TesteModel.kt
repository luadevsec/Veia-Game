package com.example.veia_game.model


class TesteModel {
    private val _board = MutableList(3) { MutableList(3) { GameCell() } }
    var currentPlayer = Player.X
        private set

    // Função para obter o tabuleiro
    fun getBoard(): List<List<GameCell>> = _board

    // Verifica se a célula está vazia e faz um movimento
    fun makeMove(row: Int, column: Int): Boolean {
        if (_board[row][column].player == Player.NONE) {
            _board[row][column] = GameCell(currentPlayer)
            currentPlayer = if (currentPlayer == Player.X) Player.O else Player.X
            return true
        }
        return false
    }

    // Verifica se alguém ganhou
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

    // Reinicia o jogo
    fun resetGame() {
        for (row in _board.indices) {
            for (col in _board[row].indices) {
                _board[row][col] = GameCell()
            }
        }
        currentPlayer = Player.X
    }
}
