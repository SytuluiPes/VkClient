package ru.artem.vkclient.ui.h2s4.data

import ru.artem.vkclient.data.Gender.Male.asString
import ru.artem.vkclient.data.SocialProfileModel
import ru.artem.vkclient.data.asString

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
        gender = this.gender.asString(),
        posts = this.posts.toString(),
        followers = this.followers.toString(),
        following = this.following.toString(),
        status = this.status,
    )