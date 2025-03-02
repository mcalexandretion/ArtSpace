package com.example.artspace

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.model.ImagesRepository
import com.example.artspace.config.CurrentIndex
import com.example.artspace.GetButtonBox

@Composable
fun MainScreen(modifier: Modifier = Modifier) {

        Column(modifier = modifier.fillMaxSize()) {
            // Первый элемент с весом 1
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(
                    text = "Art Space",
                    textAlign = TextAlign.Center,
                    fontSize = 50.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
            }

            // Второй элемент с весом 4
            ImageDisplay(modifier = Modifier.weight(5f))

            // Третий элемент с весом 1
            GetButtonBox(modifier = Modifier.weight(1f))
        }
    }


@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    MainScreen()
}
