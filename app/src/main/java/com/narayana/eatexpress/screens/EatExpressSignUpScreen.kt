package com.narayana.eatexpress.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.narayana.eatexpress.EatExpresscomponents.ButtonComponent
import com.narayana.eatexpress.EatExpresscomponents.CheckboxComponent
import com.narayana.eatexpress.EatExpresscomponents.ClickableLoginTextComponent
import com.narayana.eatexpress.EatExpresscomponents.DividerTextComponent
import com.narayana.eatexpress.EatExpresscomponents.HeadingTextComponent
import com.narayana.eatexpress.EatExpresscomponents.MyTextFieldComponent
import com.narayana.eatexpress.EatExpresscomponents.PasswordTextFieldComponent
import com.narayana.eatexpress.data.Eatexpresssignup.EatexpressSignupUIEvent
import com.narayana.eatexpress.data.Eatexpresssignup.EatexpressSignupViewModel
import com.narayana.eatexpress.EatExpressnavigation.AppRouter
import com.narayana.eatexpress.EatExpressnavigation.Screen
import com.narayana.eatexpress.R


@Composable
fun SignUpScreen(signupViewModel: EatexpressSignupViewModel = viewModel()) {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(color = Color(R.color.liteGray)),
        contentAlignment = Alignment.Center,

    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(color =  Color(R.color.liteGray))
                .align(Alignment.Center)
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color(R.color.liteGray)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Image(
                    modifier = Modifier.size(150.dp),
                    painter = painterResource(id = R.drawable.fooddelivery_logo), contentDescription = null)
                Spacer(modifier = Modifier.height(10.dp))
                  HeadingTextComponent(value = "EatExpress App")
                  Spacer(modifier = Modifier.height(8.dp))
                  MyTextFieldComponent(
                    labelValue = stringResource(id = R.string.first_name),
                    painterResource(id = R.drawable.profile),
                    onTextChanged = {
                        signupViewModel.onEvent(EatexpressSignupUIEvent.FirstNameChanged(it))
                    },
                    errorStatus = signupViewModel.registrationUIState.value.firstNameError
                )

                MyTextFieldComponent(
                    labelValue = stringResource(id = R.string.last_name),
                    painterResource = painterResource(id = R.drawable.profile),
                    onTextChanged = {
                        signupViewModel.onEvent(EatexpressSignupUIEvent.LastNameChanged(it))
                    },
                    errorStatus = signupViewModel.registrationUIState.value.lastNameError
                )

                MyTextFieldComponent(
                    labelValue = stringResource(id = R.string.email),
                    painterResource = painterResource(id = R.drawable.message),
                    onTextChanged = {
                        signupViewModel.onEvent(EatexpressSignupUIEvent.EmailChanged(it))
                    },
                    errorStatus = signupViewModel.registrationUIState.value.emailError
                )

                PasswordTextFieldComponent(
                    labelValue = stringResource(id = R.string.password),
                    painterResource = painterResource(id = R.drawable.ic_lock),
                    onTextSelected = {
                        signupViewModel.onEvent(EatexpressSignupUIEvent.PasswordChanged(it))
                    },
                    errorStatus = signupViewModel.registrationUIState.value.passwordError
                )

                CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                    onTextSelected = {
                        AppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                    },
                    onCheckedChange = {
                        signupViewModel.onEvent(EatexpressSignupUIEvent.PrivacyPolicyCheckBoxClicked(it))
                    }
                )

                Spacer(modifier = Modifier.height(10.dp))

                ButtonComponent(
                    value = stringResource(id = R.string.register),
                    onButtonClicked = {
                        signupViewModel.onEvent(EatexpressSignupUIEvent.RegisterButtonClicked)
                    },
                    isEnabled = signupViewModel.allValidationsPassed.value
                )

                Spacer(modifier = Modifier.height(10.dp))

                DividerTextComponent()

                ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                    AppRouter.navigateTo(Screen.LoginScreen)
                })
            }
        }


        if(signupViewModel.signUpInProgress.value) {
            CircularProgressIndicator()
        }
    }

}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}