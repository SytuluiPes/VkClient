package ru.artem.vkclient.core.ui.theme

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Light theme"
)
@Preview(
    name = "Dark theme",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    locale = "ru"
)
annotation class ThemePreview
