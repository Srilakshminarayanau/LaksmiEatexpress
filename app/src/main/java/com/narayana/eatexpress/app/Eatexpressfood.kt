package com.narayana.eatexpress.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.narayana.eatexpress.data.EatExpresshome.EatExpressViewModel
import com.narayana.eatexpress.EatExpressnavigation.AppRouter
import com.narayana.eatexpress.EatExpressnavigation.Screen
import com.narayana.eatexpress.screens.HomeScreen
import com.narayana.eatexpress.screens.LoginScreen
import com.narayana.eatexpress.screens.SignUpScreen
import com.narayana.eatexpress.screens.TermsAndConditionsScreen


@Composable
fun FoodApps(homeViewModel: EatExpressViewModel = viewModel()) {

    homeViewModel.checkForActiveSession()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {

        if (homeViewModel.isUserLoggedIn.value == true) {
            AppRouter.navigateTo(Screen.HomeScreen)
        }

        Crossfade(targetState = AppRouter.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }

                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }

                is Screen.LoginScreen -> {
                    LoginScreen()
                }

                is Screen.HomeScreen -> {
                    HomeScreen()
                }
            }
        }

    }
}