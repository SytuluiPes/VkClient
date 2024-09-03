package ru.artem.vkclient

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.artem.vkclient.ui.h2s4.InstagramProfile
import ru.artem.vkclient.ui.h2s4.InstagramProfileViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramProfile(viewModel = InstagramProfileViewModel())
        }
    }
}