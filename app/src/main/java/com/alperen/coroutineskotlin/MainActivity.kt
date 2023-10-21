package com.alperen.coroutineskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    GlobalScope.launch {
        repeat(100){
            launch{
                println("mrb")
            }
        }
    }
        println("run blocking start")
        runBlocking {
            launch {
                delay(2000)
                println("run blocking")
            }
        }
        println("runblocking end.")
     GlobalScope.launch {
         delay(10000)
     println("10sn sonra gelecek")
     }
        CoroutineScope(Dispatchers.Default).launch{
            delay(5000)
            println("coroutinescope")
        }
        println("coroutine scope end")
 
    }

}