package com.example.artspace

import com.example.artspace.config.CurrentIndex
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GetButtonBox(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {
                    CurrentIndex.UpdateIndex(isNext = false);
                }, colors = ButtonDefaults.buttonColors(
                    contentColor = Color(0xFFFFFFFF),
                    containerColor = Color(0xFF0582EA)
                ),
                modifier = Modifier.width(150.dp)
            ) {
                Text("Back", fontSize = 15.sp)
            }
            Button(
                onClick = {
                    CurrentIndex.UpdateIndex(isNext = true);
                }, colors = ButtonDefaults.buttonColors(
                    contentColor = Color(0xFFFFFFFF),
                    containerColor = Color(0xFF0582EA)
                ),
                modifier = Modifier.width(150.dp)
            ) {
                Text("Next", fontSize = 15.sp)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewButtonBox() {
    GetButtonBox()
}