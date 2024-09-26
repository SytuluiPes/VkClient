package ru.artem.vkclient.core.data

data class UserName(
    val firstName: String,
    val lastName: String,
)

fun UserName.asString() = "$firstName $lastName"