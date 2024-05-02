package com.example.mvvm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        button.setOnclicklistener{

            val valueofA = et_demo_a.text.toString()
            val valueofB = et_demo_b.text.toString()
            val total = mViewmodel.sum(valueofA.toInt(),valueofB.toINT())
        }
    }
}