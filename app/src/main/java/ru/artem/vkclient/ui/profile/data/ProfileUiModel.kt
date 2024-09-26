package ru.artem.vkclient.ui.profile.data

import ru.artem.vkclient.core.data.SocialProfileModel
import ru.artem.vkclient.core.data.asString
import ru.artem.vkclient.core.util.orDash

data class InstagramProfileUiModel(
    val nickname: String,
    val name: String,
    val gender: String,
    val posts: String,
    val followers: String,
    val following: String,
    val status: String,
)

fun SocialProfileModel.asInstagramProfileUiModel() =
    InstagramProfileUiModel(
        nickname = this.nickname,
        name = this.userName.asString(),
        gender = this.gender.sex,
        posts = this.posts.toString(),
        followers = this.followers.toString(),
        following = this.following.toString(),
        status = this.status.orDash(),
    )