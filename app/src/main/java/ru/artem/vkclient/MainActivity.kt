package ru.artem.vkclient

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.artem.vkclient.ui.authorization.AuthorizationScreen
import ru.artem.vkclient.ui.authorization.AuthorizationViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AuthorizationScreen(AuthorizationViewModel())
        }
    }
}