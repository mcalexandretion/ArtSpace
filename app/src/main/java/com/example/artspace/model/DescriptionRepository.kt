package com.example.artspace.model

import androidx.compose.ui.res.stringResource
import com.example.artspace.R

object DescriptionRepository{
    val descriptions = listOf(
        Description(
            firstDesResId = R.string.description1,
            secondDesResId = R.string.description1_2
        ),
        Description(
            firstDesResId = R.string.description2,
            secondDesResId = R.string.description2_2
        ),
        Description(
            firstDesResId = R.string.description3,
            secondDesResId = R.string.description3_2
        ),
        Description(
            firstDesResId = R.string.description4,
            secondDesResId = R.string.description4_2
        ),
        Description(
            firstDesResId = R.string.description5,
            secondDesResId = R.string.description5_2
        ),

    )
    fun GetDescriptionSize(): Int{
        return descriptions.size
    }
    fun GetDescriptions(): List<Description> {
        return descriptions
    }

}

