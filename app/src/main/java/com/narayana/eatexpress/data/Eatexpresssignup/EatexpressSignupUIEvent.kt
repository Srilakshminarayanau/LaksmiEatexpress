package  com.narayana.eatexpress.data.Eatexpresssignup

sealed class EatexpressSignupUIEvent{

    data class FirstNameChanged(val firstName:String) : EatexpressSignupUIEvent()
    data class LastNameChanged(val lastName:String) : EatexpressSignupUIEvent()
    data class EmailChanged(val email:String): EatexpressSignupUIEvent()
    data class PasswordChanged(val password: String) : EatexpressSignupUIEvent()

    data class PrivacyPolicyCheckBoxClicked(val status:Boolean) : EatexpressSignupUIEvent()

    object RegisterButtonClicked : EatexpressSignupUIEvent()
}
