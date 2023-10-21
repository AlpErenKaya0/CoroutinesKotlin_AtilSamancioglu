package com.alperen.coroutineskotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking {
        val myJob = launch {
            delay(2000)
        }
        myJob.invokeOnCompletion {
            println("bitti")
        }
    }

}