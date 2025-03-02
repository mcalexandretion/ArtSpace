package com.example.artspace.model

import com.example.artspace.R

object ImagesRepository{
    val images = listOf(
    Image(R.drawable.image1, R.string.description1),
    Image(R.drawable.image2, R.string.description2),
    Image(R.drawable.image3, R.string.description3),
    Image(R.drawable.image4, R.string.description4),
    Image(R.drawable.image5, R.string.description5)
    )
    fun GetImagesSize(): Int{
        return images.size
    }
    fun GetImages(): List<Image> {
        return images
    }

}

