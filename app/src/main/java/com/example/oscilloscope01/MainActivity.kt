package com.example.oscilloscope01

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun function5(view: View) {
        val fun5Toast = Toast.makeText(this, "Function 5 is temporarily not in use", Toast.LENGTH_SHORT)
        fun5Toast.show()
    }

    fun oscilloscopeStart(v: View) {
        val oscilloscopeIntent = Intent(this, OscilloscopeActivity::class.java)
        oscilloscopeIntent.putExtra("Extra_No_1", 1)
        startActivity(oscilloscopeIntent)
    }

    fun analyserStart(v: View) {
        val analyserIntent = Intent(this, AnalyserActivity::class.java)
        // analyserIntent.putExtra("Extra_No_1", 1)
        startActivity(analyserIntent)
    }
}