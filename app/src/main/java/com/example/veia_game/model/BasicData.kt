package com.example.veia_game.model


enum class Player { X, O, NONE }

data class GameCell(val player: Player = Player.NONE)