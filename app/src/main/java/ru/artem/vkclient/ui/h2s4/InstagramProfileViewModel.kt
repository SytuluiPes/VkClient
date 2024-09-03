package ru.artem.vkclient.ui.h2s4

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import ru.artem.vkclient.data.Gender
import ru.artem.vkclient.data.SocialProfileModel
import ru.artem.vkclient.data.UserName
import ru.artem.vkclient.ui.h2s4.data.InstagramProfileUiModel
import ru.artem.vkclient.ui.h2s4.data.asInstagramProfileUiModel

class InstagramProfileViewModel : ViewModel() {

    var profileUiModel: InstagramProfileUiModel? by mutableStateOf(null)

    private val socialProfileModel: SocialProfileModel = SocialProfileModel(
        nickname = "sytylui_pes",
        userName = UserName(
            firstName = "Artem",
            lastName = "Kovalev",
        ),
        gender = Gender.Male,
        posts = 216,
        followers = 138,
        following = 133,
        status = "АБСДИФДЖИЕЙЧАЙДЖЕЙКЕЙЛМОПИКЬЮАРЭСТИЮВИДАБЛВИКСВАЙЗЕТ"
    )

    init {
        fillUiModel()
    }

    private fun fillUiModel() {
        profileUiModel = socialProfileModel.asInstagramProfileUiModel()
    }
}