package ru.artem.vkclient.ui.authorization

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import ru.artem.vkclient.core.util.Constant


class AuthorizationViewModel(

) : ViewModel() {
    var login: String by mutableStateOf(Constant.EMPTY)
    var password: String by mutableStateOf(Constant.EMPTY)

    fun onLoginChange(newLogin: String) {
        login = newLogin
    }

    fun onPasswordChange(newPassword: String) {
        password = newPassword
    }

    fun launchAuthorization() {

    }
}