package com.example.artspace.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ImageDisplay
import com.example.artspace.config.CurrentIndex
import com.example.artspace.model.DescriptionRepository

@Composable
fun GetDescriptionBox(modifier: Modifier=Modifier){
    val currentIndex = CurrentIndex.value.value
    val descriptions = DescriptionRepository.GetDescriptions()
    val description = descriptions[currentIndex]

    Box(modifier = modifier.fillMaxWidth().padding(10.dp)){
        Column(modifier = Modifier.padding(start = 10.dp)) {
            Text(
                text = stringResource(description.firstDesResId),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0582EA)
            )
            Text(
                text = stringResource(description.secondDesResId),
                fontSize = 15.sp,
                color = Color(0xFF0D3041)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDescriptionBox() {
    GetDescriptionBox()
}
