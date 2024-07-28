package com.narayana.eatexpress

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.narayana.eatexpress.ui.theme.FoodDeliveryTheme

class DetailedPageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodDeliveryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 390.dp)
            .requiredHeight(height = 844.dp)
            .clip(shape = RoundedCornerShape(40.dp))
            .background(brush = Brush.linearGradient(
                0.05f to Color(0xff4a087e),
                1f to Color(0xff4c0881).copy(alpha = 0.81f),
                1f to Color(0xffac08f8).copy(alpha = 0.48f),
                start = Offset(195f, 0f),
                end = Offset(195f, 844f)))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 374.dp)
                .requiredWidth(width = 390.dp)
                .requiredHeight(height = 470.dp)
                .clip(shape = RoundedCornerShape(topStart = 60.dp))
                .background(color = Color(0xfffffcfc)))
//        Text(
//            text = "",
//            color = Color.Black,
//            textAlign = TextAlign.Center,
//            style = TextStyle(
//                fontSize = 20.sp,
//                fontWeight = FontWeight.Bold),
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 28.dp,
//                    y = 607.dp))

        Text(
            text = "Big juicy Beef Burger with cheese lettuce, tomato , onions and special saucet",
            color = Color(0xFFB389FF),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 12.dp,
                    y = 546.dp
                )
                .requiredWidth(width = 322.dp)
                .requiredHeight(height = 44.dp)
        )




        Text(
            text = "Big juicy Beef Burger with cheese lettuce, tomato , onions and special saucet",
            color = Color.White.copy(alpha = 0.44f),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 12.dp,
                    y = 486.dp)
                .requiredWidth(width = 322.dp)
                .requiredHeight(height = 44.dp))
        Text(
            text = "Beef  Burger ",
            color = Color.Black.copy(alpha = 0.77f),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 22.dp,
                    y = 481.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 86.dp,
                    y = 97.dp)
                .requiredWidth(width = 238.dp)
                .requiredHeight(height = 222.dp)
                .background(brush = Brush.linearGradient(
                    0f to Color(0xffd9d9d9),
                    0.12f to Color(0xffd9d9d9).copy(alpha = 0.24f),
                    0.24f to Color(0xffd9d9d9).copy(alpha = 0.09f),
                    0.36f to Color(0xffd9d9d9).copy(alpha = 0.03f),
                    0.49f to Color(0xffd9d9d9),
                    0.61f to Color(0xffd9d9d9).copy(alpha = 0.02f),
                    0.69f to Color(0xffd9d9d9),
                    0.79f to Color(0xffd9d9d9).copy(alpha = 0.13f),
                    0.92f to Color(0xffd9d9d9).copy(alpha = 0.74f),
                    start = Offset(119f, 0f),
                    end = Offset(119f, 222f))))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 63.dp,
                    y = 71.dp)
                .requiredWidth(width = 284.dp)
                .requiredHeight(height = 275.dp)
                .background(brush = Brush.linearGradient(
                    0f to Color(0xffd9d9d9).copy(alpha = 0.26f),
                    1f to Color(0xffd9d9d9),
                    start = Offset(142f, 0f),
                    end = Offset(142f, 275f))))
        Image(
            painter = painterResource(id = R.drawable.pngwing6),
            contentDescription = "pngwing 6",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 86.dp,
                    y = 71.dp)
                .requiredWidth(width = 241.dp)
                .requiredHeight(height = 264.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 20.dp,
                    y = 415.dp)
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 48.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xff8d27dd)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp,
                    y = 427.dp)
                .requiredWidth(width = 22.dp)
                .requiredHeight(height = 24.dp)
               )
        Text(
            text = " 4.5",
            color = Color(0xfffbf7f7),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 54.dp,
                    y = 422.dp)
                .requiredWidth(width = 51.dp)
                .requiredHeight(height = 40.dp))
        Text(
            text = "£40",
            color = Color(0xfff6de0d),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 313.dp,
                    y = 424.dp))

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 140.dp,
                    y = 643.dp)
                .requiredWidth(width = 80.dp)
                .requiredHeight(height = 76.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 267.dp,
                    y = 643.dp)
                .requiredWidth(width = 80.dp)
                .requiredHeight(height = 76.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffd9d9d9)))

        Image(
            painter = painterResource(id = R.drawable.add_to_cart3),
            contentDescription = "add-to-cart 4",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 196.dp,
                    y = 636.dp)
                .requiredWidth(width = 25.dp)
                .requiredHeight(height = 23.dp))
        Image(
            painter = painterResource(id = R.drawable.add_to_cart3),
            contentDescription = "add-to-cart 6",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 196.dp,
                    y = 636.dp)
                .requiredWidth(width = 25.dp)
                .requiredHeight(height = 23.dp))
        Image(
            painter = painterResource(id = R.drawable.add_to_cart3),
            contentDescription = "add-to-cart 5",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 327.dp,
                    y = 636.dp)
                .requiredWidth(width = 25.dp)
                .requiredHeight(height = 23.dp))
        Image(
            painter = painterResource(id = R.drawable.pngwing7),
            contentDescription = "pngwing 7",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 163.dp,
                    y = 648.dp)
                .requiredWidth(width = 33.dp)
                .requiredHeight(height = 50.dp))
        Image(
            painter = painterResource(id = R.drawable.pngwing8),
            contentDescription = "pngwing 8",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 283.dp,
                    y = 648.dp)
                .requiredWidth(width = 41.dp)
                .requiredHeight(height = 56.dp))
        val context = LocalContext.current
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 45.dp,
                    y = 730.dp)
                .requiredWidth(width = 269.dp)
                .requiredHeight(height = 52.dp)
                .clickable {
                    context.startActivity(Intent(context,OrdersActivity::class.java))

                }
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color(0xff8d27dd)))
        Text(
            text = "Go to payment",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 105.dp,
                    y = 745.dp)
                .requiredWidth(width = 146.dp)
                .requiredHeight(height = 31.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FoodDeliveryTheme {
        Greeting("Android")
    }
}