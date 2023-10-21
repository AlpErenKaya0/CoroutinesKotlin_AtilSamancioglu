package com.alperen.coroutineskotlin

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        myFunction()
    }
}
suspend fun myFunction(){
    coroutineScope {
        delay(4000)
        println("suspend fun")

    }
}