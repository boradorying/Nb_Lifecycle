package com.example.simhwa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SceondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sceond)
        Log.d("jun","second: onCreate")

        val backBtn = findViewById<Button>(R.id.backMainBtn)
        backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("jun","second: onStart")
    }

    override fun onResume() {
        Log.d("jun","second: onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("jun","second: onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("jun","second: onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("jun","second: onDestroy")
        super.onDestroy()
    }
}