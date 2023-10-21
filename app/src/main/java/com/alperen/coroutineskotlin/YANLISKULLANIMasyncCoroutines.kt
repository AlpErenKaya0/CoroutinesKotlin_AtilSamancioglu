package com.alperen.coroutineskotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
runBlocking {
    launch {
        val downloadedName = downloadName()
        println("${downloadedName}")
    }
    launch {
        val downloadedAge = downloadAge()
        println("${downloadedAge}")
    }
    //AMA BURADAN ERİŞEMEZSİN YANLIŞ!! KULLANIM.

}


}
/*
suspend fun downloadName():String{
    delay(2000)
    val userName = "Atil"
    println("username download")
    return userName
}
suspend fun downloadAge():Int{
    delay(4000)
    val userAge = 60
    println("userage download")
    return userAge
}

 */