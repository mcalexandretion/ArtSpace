package com.example.artspace.model

import com.example.artspace.R

object ImagesRepository{
    val images = listOf(
    Image(R.drawable.image1),
    Image(R.drawable.image2),
    Image(R.drawable.image3),
    Image(R.drawable.image4),
    Image(R.drawable.image5)
    )
    fun GetImagesSize(): Int{
        return images.size
    }
    fun GetImages(): List<Image> {
        return images
    }

}

