package com.narayana.eatexpress.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.narayana.eatexpress.R
import com.narayana.eatexpress.EatExpresscomponents.HeadingTextComponent
import com.narayana.eatexpress.EatExpresscomponents.NormalTextComponent
import com.narayana.eatexpress.EatExpressnavigation.AppRouter
import com.narayana.eatexpress.EatExpressnavigation.Screen
import com.narayana.eatexpress.EatExpressnavigation.SystemBackButtonHandler

@Composable
fun TermsAndConditionsScreen() {
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)) {


        Image(
            painter = painterResource(id = R.drawable.fooddelivery_logo),
            contentDescription = "pngwing 3",
            modifier = Modifier

                .offset(x = 8.dp,
                    y = 88.dp)
                .requiredWidth(width = 165.dp)

                .requiredHeight(height = 202.dp))

        HeadingTextComponent(value = stringResource(id = R.string.terms_and_conditions_header))
        }
    NormalTextComponent(value = stringResource(id = R.string.terms_and_conditions_headerdes))

    SystemBackButtonHandler {
        AppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun TermsAndConditionsScreenPreview(){
    TermsAndConditionsScreen()
}