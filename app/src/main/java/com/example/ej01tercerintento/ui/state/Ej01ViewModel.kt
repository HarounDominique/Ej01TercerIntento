package com.example.ej01tercerintento.ui.state

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class Ej01ViewModel(): ViewModel() {
    private val _counterList = mutableStateListOf<Int>()
    val counterList get() = _counterList

    var numCounter = _counterList.size


    //FUNCIONES
    fun resetNumCounter(){
        numCounter=0
    }
}