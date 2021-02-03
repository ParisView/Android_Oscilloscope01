package com.example.oscilloscope01

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class AnalyserActivity : AppCompatActivity() {

    private lateinit var analyserViewModel: AnalyserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_analyser)

        analyserViewModel = ViewModelProvider(this).get(AnalyserViewModel::class.java)

        val analyserTextToChange: TextView = findViewById(R.id.analyserActNumberToChange)

        val analyserObserver = Observer<Int>{t: Int? -> analyserTextToChange.text = t.toString() }
        analyserViewModel.numberToChange.observe(this, analyserObserver)

    }


    fun analyserActNumAdd(v: View) {
        var tempVar = analyserViewModel.numberToChange.value!!
        ++tempVar
        analyserViewModel.numberToChange.value = tempVar
    }
}