package com.example.simhwa

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("jun","fragment : onCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("jun","fragment : onCreateView")
        val view = inflater.inflate(R.layout.fragment_first,container,false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("jun","fragment : onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("jun","fragment : onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("jun","fragment : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("jun","fragment : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("jun","fragment : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("jun","fragment : onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {//프래그먼트의 ㅅ ㅏㅇ태가 해당액티비와함께 소멸될때까지 기다리기
        super.onSaveInstanceState(outState)
        Log.d("jun","fragment : onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("jun","fragment : onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("jun","fragment : onDestroy")
    }
}