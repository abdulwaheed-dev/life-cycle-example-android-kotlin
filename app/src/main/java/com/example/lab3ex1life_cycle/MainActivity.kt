package com.example.lab3ex1life_cycle

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("t0","onCreate method called")
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        Log.d("t2","onStart method called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("t3","onResume method called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("t4","onPause method called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("t5","onStop method called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("t6","onRestart method called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("t7","onDestroy method called")
    }
}