package com.example.ej01tercerintento.ui.state

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class Ej01ViewModel(): ViewModel() {
    private val _counterList = mutableStateListOf<Int>()
    val counterList get() = _counterList

    private var _numCounter by mutableStateOf(0)
    val numCounter get() = _numCounter

    private var _firstScreenTextFieldValue by mutableStateOf(0)
    val firstScreenTextFieldValue get() = _firstScreenTextFieldValue

    //FUNCIONES
    fun resetNumCounter(){
        _numCounter=0
    }

    fun increaseCounter(index:Int){
        _counterList[index]++
    }

    fun decreaseCounter(index:Int){
        _counterList[index]--
    }

    fun setFirstScreenTextFieldValue(text:String){
        _numCounter=text.toIntOrNull()?:0
    }

    fun setNumCounter(text: String){
        _numCounter=text.toIntOrNull()?:0
    }

    fun counterListInit(number:Int){
        repeat(number){
            counterList[it]=0
        }
    }
}