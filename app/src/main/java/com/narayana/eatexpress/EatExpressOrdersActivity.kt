
package com.narayana.eatexpress

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.narayana.eatexpress.ui.theme.FoodDeliveryTheme
import com.narayana.eatexpress.ui.theme.Primary

class OrdersActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodDeliveryTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PaymentScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaymentScreen() {
    val context = LocalContext.current
    val cardNumber = remember { mutableStateOf("") }
    val expirationDate = remember { mutableStateOf("") }
    val cvv = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val context = LocalContext.current
        Text(
            text = "Payment Details",
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = cardNumber.value,
            onValueChange = { cardNumber.value = it },
            label = { Text("Card Number") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = expirationDate.value,
            onValueChange = { expirationDate.value = it },
            label = { Text("Expiration Date") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = cvv.value,
            onValueChange = { cvv.value = it },
            label = { Text("CVV") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                // Navigate to confirmation screen
                context.startActivity(Intent(context, ConfirmationActivity::class.java))
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Submit Payment")
        }
    }
}

class ConfirmationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodDeliveryTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ConfirmationScreen()
                }
            }
        }
    }
}

@Composable
fun ConfirmationScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {








        Image(
            painter = painterResource(id = R.drawable.osf),
            contentDescription = "ordersuccess",
            modifier = Modifier

                .offset(x = 10.dp,
                    y = 10.dp)

                .requiredWidth(width = 282.dp)
                .requiredHeight(height = 250.dp))








        Text(
            text = "Payment Successful",
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "Thank you for your purchase!",
            style = TextStyle(fontSize = 16.sp),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        val context = LocalContext.current

        val food = ""
        androidx.compose.material.Button(
            modifier = Modifier
                .wrapContentWidth()
                .heightIn(48.dp),

            onClick = {
                context.startActivity(Intent(context, MainActivity::class.java)
                    .putExtra("food_data", food))
            },

            contentPadding = PaddingValues(),
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            shape = RoundedCornerShape(50.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(48.dp)
                    .background(
                        brush = Brush.horizontalGradient(listOf(Primary, Primary)),
                        shape = RoundedCornerShape(20.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                androidx.compose.material.Text(
                    text = "Back to Home",
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

            }

        }


    }
}

@Preview(showBackground = true)
@Composable
fun PaymentScreenPreview() {
    FoodDeliveryTheme {
        PaymentScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun ConfirmationScreenPreview() {
    FoodDeliveryTheme {
        ConfirmationScreen()
    }
}
