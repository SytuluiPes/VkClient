package ru.artem.vkclient.core.ui.layout

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun SpacerHorizontal(width: Dp) {
    Spacer(
        Modifier
            .width(width)
            .fillMaxHeight())
}

@Composable
fun SpacerVertical(width: Dp) {
    Spacer(
        Modifier
            .height(width)
            .fillMaxWidth())
}