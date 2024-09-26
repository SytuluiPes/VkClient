package ru.artem.vkclient.ui.profile

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import ru.artem.vkclient.core.data.Gender
import ru.artem.vkclient.core.data.SocialProfileModel
import ru.artem.vkclient.core.data.UserName
import ru.artem.vkclient.ui.profile.data.InstagramProfileUiModel
import ru.artem.vkclient.ui.profile.data.asInstagramProfileUiModel

class ProfileViewModel : ViewModel() {

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