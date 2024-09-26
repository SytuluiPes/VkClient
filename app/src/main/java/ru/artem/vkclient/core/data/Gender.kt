package ru.artem.vkclient.core.data

sealed interface Gender {
    val sex: String

    data object Male : Gender {
        override val sex: String = "he/him"
    }

    data object Female : Gender {
        override val sex: String = "she/her"
    }

    data object Other : Gender {
        override val sex: String = "it/its"
    }
}