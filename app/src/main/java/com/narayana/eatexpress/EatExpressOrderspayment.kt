
package com.narayana.eatexpress

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun GeneratedCode(modifier: Modifier = Modifier) {
    val cardNumber = remember { mutableStateOf("") }
    val cardHolderName = remember { mutableStateOf("") }
    val expiryDate = remember { mutableStateOf("") }
    val cvv = remember { mutableStateOf("") }
    val context = LocalContext.current

    Box(
        modifier = modifier
            .requiredWidth(375.dp)
            .requiredHeight(812.dp)
            .background(Color.White)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Box(
                modifier = Modifier

                    .offset(121.dp, 799.dp)
                    .requiredWidth(134.dp)
                    .requiredHeight(5.dp)
            ) {
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .offset(0.dp, 0.dp)
                        .requiredWidth(134.dp)
                        .requiredHeight(5.dp)
                        .clip(RoundedCornerShape(100.dp))
                        .background(Color(0xff222325))
                )
            }

            Box(
                modifier = Modifier

                    .offset(20.dp, 64.dp)
                    .requiredWidth(219.dp)
                    .requiredHeight(22.dp)
            ) {
                Text(
                    text = "Order Details",
                    color = Color(0xff222325),
                    textAlign = TextAlign.Center,
                    lineHeight = 1.29.em,
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = (-0.5).sp
                    ),
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentHeight(Alignment.CenterVertically)
                )
            }

            // Payment Input Fields
            OutlinedTextField(
                value = cardNumber.value,
                onValueChange = { cardNumber.value = it },
                label = { Text("Card Number") },
                modifier = Modifier
                    .requiredWidth(335.dp)
                    .padding(bottom = 8.dp)
            )
            OutlinedTextField(
                value = cardHolderName.value,
                onValueChange = { cardHolderName.value = it },
                label = { Text("Cardholder Name") },
                modifier = Modifier
                    .requiredWidth(335.dp)
                    .padding(bottom = 8.dp)
            )
            OutlinedTextField(
                value = expiryDate.value,
                onValueChange = { expiryDate.value = it },
                label = { Text("Expiry Date") },
                modifier = Modifier
                    .requiredWidth(335.dp)
                    .padding(bottom = 8.dp)
            )
            OutlinedTextField(
                value = cvv.value,
                onValueChange = { cvv.value = it },
                label = { Text("CVV") },
                modifier = Modifier
                    .requiredWidth(335.dp)
                    .padding(bottom = 8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    context.startActivity(Intent(context, OrderDetailsActivity::class.java))
                },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Make Payment")
            }
        }
    }
}

@Preview(widthDp = 375, heightDp = 812)
@Composable
private fun GeneratedCodePreview() {
    GeneratedCode(Modifier)
}
