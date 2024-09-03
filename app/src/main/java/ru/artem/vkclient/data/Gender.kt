package ru.artem.vkclient.data

sealed interface Gender {

    fun Gender.asString() =
        when (this) {
            Male -> "he/him"
            Female -> "she/her"
            Other -> "it/its"
        }

    data object Male : Gender
    data object Female : Gender
    data object Other : Gender
}