package com.narayana.eatexpress.data.EatExpresslogin

sealed class EatExpressLoginUIEvent{

    data class EmailChanged(val email:String): EatExpressLoginUIEvent()
    data class PasswordChanged(val password: String) : EatExpressLoginUIEvent()

    object LoginButtonClicked : EatExpressLoginUIEvent()
}
