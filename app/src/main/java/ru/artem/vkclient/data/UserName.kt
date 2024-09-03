package ru.artem.vkclient.data

data class UserName(
    val firstName: String,
    val lastName: String,
)

fun UserName.asString() = "$firstName $lastName"