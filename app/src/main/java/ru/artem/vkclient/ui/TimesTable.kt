package ru.artem.vkclient.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TimesTable(n: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        for (i in 1..n) {
            Row(
                modifier = Modifier
                    .weight(1f),
            ) {
                for (j in 1..n) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .border(BorderStroke(1.dp, Color.Black), RectangleShape)
                            .background(
                                if ((i + j) % 2 == 0)
                                    Color.Yellow
                                else
                                    Color.White
                            )
                    ) {
                        Text(
                            modifier = Modifier.align(Alignment.Center),
                            text = "${i * j}",
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun TimesTablePreview() {
    TimesTable(10)
}