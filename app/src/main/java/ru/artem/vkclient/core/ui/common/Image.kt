package ru.artem.vkclient.core.ui.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import ru.artem.vkclient.core.ui.VkColor

@Composable
fun Image(
    painter: Int,
    modifier: Modifier = Modifier,
) {
    androidx.compose.foundation.Image(
        painter = painterResource(id = painter),
        contentDescription = null,
        modifier = modifier
    )
}

@Composable
fun Icon(
    painterResource: Int,
    modifier: Modifier = Modifier,
    tint: Color = VkColor.Black,
) {
    androidx.compose.material3.Icon(
        painter = painterResource(id = painterResource),
        contentDescription = null,
        modifier = modifier,
        tint = tint,
    )
}