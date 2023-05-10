package com.example.ej01tercerintento.ui.elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ej01tercerintento.ui.state.Ej01ViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Ej01(){
    val vm: Ej01ViewModel = viewModel()
    
    Scaffold(
        topBar =  {
            TopAppBar(title = {Text("Contadores")}, actions = {
                IconButton(
                    onClick = {
                        vm.resetNumCounter()
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Refresh,
                        contentDescription = "Actualizar"
                    )
                }
            })
        }
    ) {
        Column(modifier = Modifier
            .padding(it)
            .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
            if(vm.numCounter==0){
                Text(text="Introduce el número de contadores")
                TextField(
                    value = vm.numCounter.toString(),
                    onValueChange = {vm.setFirstScreenTextFieldValue(it.toIntOrNull()?:0)})
                Button(onClick = { vm.setNumCounter(vm.numCounter.toString()) }) {
                    Text(text="Mostrar")
                }
            }else{
                repeat(vm.numCounter){
                    Counter(number = vm.numCounter.toString(), firstButtonAction = { vm.decreaseCounter(it) }, secondButtonAction = {vm.increaseCounter(it)})
                }
            }
        }
    }
}