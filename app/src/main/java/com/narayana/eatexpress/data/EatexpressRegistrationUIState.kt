package  com.narayana.eatexpress.data

data class EatexpressRegistrationUIState(
    var firstName :String = "",
    var lastName  :String = "",
    var email  :String = "",
    var password  :String = "",
    var privacyPolicyAccepted :Boolean = false,


    var firstNameError :Boolean = false,
    var lastNameError : Boolean = false,
    var emailError :Boolean = false,
    var passwordError : Boolean = false,
    var privacyPolicyError:Boolean = false


)