package com.example.ej01tercerintento.ui.state

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class Ej01ViewModel(): ViewModel() {
    private val _counterList = mutableStateListOf<Int>()
    val counterList get() = _counterList

    var numCounter = _counterList.size

    private val _firstScreenTextFieldValue by mutableStateOf("")
    val firstScreenTextFieldValue get() = _firstScreenTextFieldValue

    //FUNCIONES
    fun resetNumCounter(){
        numCounter=0
    }

    fun increaseCounter(index:Int){
        _counterList[index]++
    }

    fun decreaseCounter(index:Int){
        _counterList[index]--
    }
}