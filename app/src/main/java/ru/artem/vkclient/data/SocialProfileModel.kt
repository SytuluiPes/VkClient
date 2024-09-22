package ru.artem.vkclient.data

data class SocialProfileModel(
    val nickname: String,
    val userName: UserName,
    val gender: Gender,
    val posts: Long,
    val followers: Long,
    val following: Long,
    val status: String?,
)