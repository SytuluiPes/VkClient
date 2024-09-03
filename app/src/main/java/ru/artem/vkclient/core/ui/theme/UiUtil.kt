package ru.artem.vkclient.core.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable

@Composable
infix fun <T> T.forDark(
    dark: T,
): T =
    if (isSystemInDarkTheme()) dark else this