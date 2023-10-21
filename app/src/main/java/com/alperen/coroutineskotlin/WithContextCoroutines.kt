package com.alperen.coroutineskotlin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(){
    runBlocking {
        launch( Dispatchers.IO ){
            println("context:${coroutineContext}")
            //genelde Dispatchers.IO ile başlayan bir şey Dispatchers.Main'e referans vererek biter
            withContext(Dispatchers.Default){
                println("context: ${coroutineContext}")
            }
        }
    }
}