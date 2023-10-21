package com.alperen.coroutineskotlin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        //MAİN DİSPATCHER MAİN ACTİVİTY DE OLUŞTURULMAK ZORUNDA!!
        launch(Dispatchers.Main){
            println("main thread: ${Thread.currentThread().name}")
        }
        launch(Dispatchers.IO){
            println("IO thread: ${Thread.currentThread().name}")
        }
        launch  (Dispatchers.Default){
            println("default thread: ${Thread.currentThread().name}")
        }
        launch  (Dispatchers.Unconfined){
            println("unconfined thread: ${Thread.currentThread().name}")
        }

    }
}