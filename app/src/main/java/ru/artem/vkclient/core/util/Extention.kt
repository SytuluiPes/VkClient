package ru.artem.vkclient.core.util

fun String?.orDash(): String =
    this ?: Constant.EMPTY