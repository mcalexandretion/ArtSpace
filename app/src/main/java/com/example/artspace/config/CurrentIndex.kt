package com.example.artspace.config

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.artspace.model.ImagesRepository

object CurrentIndex {
    var value = mutableStateOf(0)
        private set

    fun UpdateIndex(isNext: Boolean) {
        val imagesSize = ImagesRepository.GetImagesSize()
        value.value = when {
            isNext && value.value < imagesSize - 1 -> value.value + 1
            isNext -> 0
            !isNext && value.value > 0 -> value.value - 1
            else -> imagesSize - 1
        }
    }
}
