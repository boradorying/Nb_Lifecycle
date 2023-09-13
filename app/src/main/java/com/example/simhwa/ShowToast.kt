package com.example.simhwa

import android.content.Context
import android.util.Log
import android.widget.Toast
import kotlin.math.log


internal fun Context.showToast(message : String,time :Int){
    Log.d("jun","Toast : $message")
    Toast.makeText(this,message,Toast.LENGTH_LONG).show()

}