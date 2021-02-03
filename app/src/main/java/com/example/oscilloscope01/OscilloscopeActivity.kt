package com.example.oscilloscope01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class OscilloscopeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oscilloscope)
        printExtra()

    }

    fun textClickFun(v: View) {
        finish()
    }

    private fun printExtra() {
        val extraValFromIntent = intent.getIntExtra("Extra_No_1",0)
        val textViewForExtra = TextView(this)
        textViewForExtra.text = Integer.toString(extraValFromIntent)
        val activityOscilloscopeLayout:ConstraintLayout = findViewById(R.id.activity_oscilloscope_layout)
        activityOscilloscopeLayout.addView(textViewForExtra)


    }
}