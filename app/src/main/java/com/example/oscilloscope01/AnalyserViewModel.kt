package com.example.oscilloscope01

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AnalyserViewModel: ViewModel() {
    var numberToChange: MutableLiveData<Int> = MutableLiveData()
    init {
        numberToChange.value = 1
    }

}