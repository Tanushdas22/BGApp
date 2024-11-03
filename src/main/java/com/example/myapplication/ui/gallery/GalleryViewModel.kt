package com.example.myapplication.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Hourly Graph's of Your Heart's Data"
    }
    val text: LiveData<String> = _text
}