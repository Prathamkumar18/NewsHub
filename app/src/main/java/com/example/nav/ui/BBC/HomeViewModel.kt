package com.example.nav.ui.BBC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is BBC Fragment"
    }
    val text: LiveData<String> = _text
}