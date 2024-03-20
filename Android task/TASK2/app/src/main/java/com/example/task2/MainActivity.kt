package com.example.task2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val secondActbutton = findViewById<Button>(R.id.second_act_btn)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this,SecondActivity :: class.java)
            startActivity(Intent)

        }
    }
}