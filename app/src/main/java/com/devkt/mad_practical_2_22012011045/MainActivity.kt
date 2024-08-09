package com.devkt.mad_practical_2_22012011045

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        val text = "onStart function called"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration)
        toast.show()
        Log.d("onStart","onStart function called")
    }

    override fun onResume() {
        super.onResume()
        Snackbar.make(
            findViewById(R.id.main),
            "onResume function called",
            Snackbar.LENGTH_SHORT
        ).show()
        Log.d("onResume","onResume function called")
    }

    override fun onPause() {
        super.onPause()
        val text = "onPause function called"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration)
        toast.show()
        Log.d("onPause","onPause function called")
    }

    override fun onStop() {
        super.onStop()
        Snackbar.make(
            findViewById(R.id.main),
            "onStop function called",
            Snackbar.LENGTH_SHORT
        ).show()
        Log.d("onStop","onStop function called")
    }

    override fun onRestart() {
        super.onRestart()
        val text = "onRestart function called"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration)
        toast.show()
        Log.d("onRestart","onRestart function called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Snackbar.make(
            findViewById(R.id.main),
            "onDestroy function called",
            Snackbar.LENGTH_SHORT
        ).show()
        Log.d("onDestroy","onDestroy function called")
    }
}