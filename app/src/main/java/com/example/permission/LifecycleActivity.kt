package com.example.permission

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LifecycleActivity: AppCompatActivity() {

    // ada 7 tahapan life cyle : onCreate, onStart, onResume, onPause, onStop, onRestart, onDestroy

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        println("BINAR -> ON CREATE")
    }

    override fun onStart() {
        super.onStart()
        println("BINAR -> ON START")
    }

    override fun onResume() {
        super.onResume()
        println("BINAR -> ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        println("BINAR -> ON PAUSE")
    }

    override fun onStop() {
        super.onStop()
        println("BINAR -> ON STOP")
    }

    override fun onRestart() {
        super.onRestart()
        println("BINAR -> ON RESTART")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("BINAR -> ON DESTROY")
    }
}