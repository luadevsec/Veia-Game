package com.example.veia_game.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _message = MutableStateFlow("Hello, World!")
    val message: StateFlow<String> = _message

    init {
        viewModelScope.launch {
            delay(3000)
            _message.value = "Welcome to Jetpack Compose!"
        }
    }

    fun ClassicGame() {
        // Lógica para iniciar o jogo clássico
    }
}
