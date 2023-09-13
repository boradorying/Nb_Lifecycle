package com.example.simhwa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toast = findViewById<Button>(R.id.toastBtn)
        toast.setOnClickListener {
            showToast("hihi",Toast.LENGTH_LONG)
        }





        val mainBtn = findViewById<Button>(R.id.mainBtn)
        mainBtn.setOnClickListener {
            val intent = Intent(this, SceondActivity::class.java)
            startActivity(intent)
            finish()
        }

        Log.d("jun", "main : onCreate")

        val fragBtn = findViewById<Button>(R.id.fragBtn)

        fragBtn.setOnClickListener {
            val fragment = FirstFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragContainer, fragment)
                .addToBackStack(null)
                .commit()
        }



        val removeBtn = findViewById<Button>(R.id.removeFrag)

        removeBtn.setOnClickListener {
            val fragment = supportFragmentManager.findFragmentById(R.id.fragContainer)
            supportFragmentManager.beginTransaction()
                .remove(fragment!!)
                .commit()
        }


//        removeBtn.setOnClickListener {
//            val fragment = supportFragmentManager.findFragmentById(R.id.fragContainer)
//
//            if (fragment != null) {
//                supportFragmentManager.beginTransaction()
//                    .remove(fragment)
//                    .commit()
//            }
//        }

    }


    override fun onStart() {

        Log.d("jun", "main : onStart")
        super.onStart()
    }

    override fun onResume() {

        Log.d("jun", "main : onResume")
        super.onResume()
    }

    override fun onPause() {

        Log.d("jun", "main : onPause")
        super.onPause()
    }

    override fun onStop() {

        Log.d("jun", "main : onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("jun", "main : onDestroy")
        super.onDestroy()//액티비티를 제거할 때 호출댐 뒤로가기나 액티비티를 종료할 때 즉 해당액티비티에서 finish를 함으로써 해당 액티비티가 사라짐
    }
}