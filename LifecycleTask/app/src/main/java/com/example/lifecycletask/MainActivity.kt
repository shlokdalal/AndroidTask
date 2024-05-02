package com.example.lifecycletask

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d("TAG", "onCreate: I am running")
        Toast.makeText(this,"on",Toast.LENGTH_SHORT).show()

        }
    

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart: I am running")
     Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onStart: I am running")
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onStart: I am running")
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStart: I am running")
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG", "onStart: I am running")
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "onStart: I am running")
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show()
    }

    }




