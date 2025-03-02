package com.example.artspace

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.model.Image
import com.example.artspace.config.CurrentIndex
import com.example.artspace.model.ImagesRepository
@Composable
fun ImageDisplay(modifier: Modifier = Modifier) {
    val currentIndex = CurrentIndex.value.value
    val images = ImagesRepository.GetImages()

    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, // Центрирование содержимого
            verticalArrangement = Arrangement.Top // Расположение элементов вверху
        ) {
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .background(color = Color(0x33003C77))
                    .shadow(3.dp)
                   // .wrapContentSize() // Использование wrapContentSize для рамки
                    .padding(20.dp)
            ) {
                Image(
                    painter = painterResource(id = images[currentIndex].imageResId),
                    contentDescription = "Image",
                   // modifier = Modifier.wrapContentSize() // Использование wrapContentSize для изображения
                )
            }

            val description = stringResource(id = images[currentIndex].descriptionResId)
            val descriptionParts = description.split(".")

            Column(modifier = Modifier.padding(10.dp)) {
                Text(
                    text = descriptionParts[0],
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF0582EA)
                )
                if (descriptionParts.size > 1) {
                    Text(
                        text = descriptionParts[1],
                        fontSize = 15.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewImageDisplay() {
    ImageDisplay()
}

