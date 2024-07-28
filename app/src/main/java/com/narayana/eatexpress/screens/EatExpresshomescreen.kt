package com.narayana.eatexpress.screens


import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.narayana.eatexpress.CameraActivity
import com.narayana.eatexpress.DetailedPageActivity

import com.narayana.eatexpress.R
import com.narayana.eatexpress.EatExpresscomponents.AppToolbar
import com.narayana.eatexpress.EatExpresscomponents.NavigationDrawerBody
import com.narayana.eatexpress.EatExpresscomponents.NavigationDrawerHeader

import com.narayana.eatexpress.data.EatExpresshome.EatExpressViewModel
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(homeViewModel: EatExpressViewModel = viewModel()) {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    homeViewModel.getUserData()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppToolbar(toolbarTitle = stringResource(id = R.string.home),
                logoutButtonClicked = {
                    homeViewModel.logout()
                },
                navigationIconClicked = {
                    coroutineScope.launch {
                        scaffoldState.drawerState.open()
                  4  }
                }
            )
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
        drawerContent = {
            NavigationDrawerHeader(homeViewModel.emailId.value)
            NavigationDrawerBody(navigationDrawerItems = homeViewModel.navigationItemsList,
                onNavigationItemClicked = {
                    Log.d("ComingHere","inside_NavigationItemClicked")
                    Log.d("ComingHere","${it.itemId} ${it.title}")
                })
        }

    ) { paddingValues ->

        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {

                Box(
                    modifier = Modifier
                        .requiredWidth(width = 390.dp)
                        .requiredHeight(height = 844.dp)
                        .clip(shape = RoundedCornerShape(40.dp))
                        .background(color = Color.White)
                ) {

                    val context = LocalContext.current
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 31.dp, y = 112.dp)
                            .requiredWidth(width = 328.dp)
                            .requiredHeight(height = 46.dp)
                            .clickable {
                                context.startActivity(Intent(context,CameraActivity::class.java))
                            }
                            .clip(shape = RoundedCornerShape(30.dp))
                            .background(color = Color(0xFF6650a4)))

                    Text(
                        text = "Profile",
                        color = Color(0xFFF7F8F8),
                        textAlign = TextAlign.Center,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 40.dp, y = 123.dp)
                            .requiredWidth(width = 154.dp)
                            .requiredHeight(height = 43.dp))
                    Text(
                        text = "Information",
                        color = Color(0xFFF7F8F8),
                        textAlign = TextAlign.Center,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 130.dp, y = 123.dp)
                            .requiredWidth(width = 154.dp)
                            .requiredHeight(height = 43.dp))

                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 31.dp,
                                y = 191.dp)
                            .requiredWidth(width = 72.dp)
                            .requiredHeight(height = 66.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .background(color = Color(0xff8d27dd)))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 113.dp,
                                y = 191.dp)
                            .requiredWidth(width = 72.dp)
                            .requiredHeight(height = 66.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .background(color = Color(0xffdad1e0)))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 195.dp,
                                y = 191.dp)
                            .requiredWidth(width = 72.dp)
                            .requiredHeight(height = 66.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .background(color = Color(0xffd4ced9)))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 277.dp,
                                y = 191.dp)
                            .requiredWidth(width = 72.dp)
                            .requiredHeight(height = 66.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .background(color = Color(0xffd5cfda)))
                    val localContext = LocalContext.current
                    Text(
                        text = "All",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 18.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 53.dp,
                                y = 264.dp))
                    Text(
                        text = "Burger",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 18.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 123.dp,
                                y = 265.dp))
                    Text(
                        text = "Pizza",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 18.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 211.dp,
                                y = 266.dp))
                    Text(
                        text = "Dessert",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 18.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 279.dp,
                                y = 267.dp)
                            .requiredWidth(width = 80.dp)
                            .requiredHeight(height = 34.dp))
                    Image(
                        painter = painterResource(id = R.drawable.pngwing2),
                        contentDescription = "pngwing 2",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 195.dp,
                                y = 205.dp)
                            .clickable {
                                localContext.startActivity(
                                    Intent(localContext, DetailedPageActivity::class.java)
                                )
                            }
                            .requiredWidth(width = 72.dp)
                            .requiredHeight(height = 38.dp))
                    Image(
                        painter = painterResource(id = R.drawable.all1),
                        contentDescription = "all",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 8.dp,
                                y = 180.dp)
                            .clickable {
                                localContext.startActivity(
                                    Intent(localContext, DetailedPageActivity::class.java)
                                )
                            }
                            .requiredWidth(width = 112.dp)
                            .requiredHeight(height = 70.dp))
                    Image(
                        painter = painterResource(id = R.drawable.pngwing6),
                        contentDescription = "burger",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 105.dp,
                                y = 200.dp)
                            .clickable {
                                localContext.startActivity(
                                    Intent(localContext, DetailedPageActivity::class.java)
                                )
                            }
                            .requiredWidth(width = 82.dp)
                            .requiredHeight(height = 50.dp))
                    Image(
                        painter = painterResource(id = R.drawable.pngwing3),
                        contentDescription = "pngwing 3",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 284.dp,
                                y = 198.dp)
                            .requiredWidth(width = 65.dp)
                            .clickable {
                                localContext.startActivity(
                                    Intent(localContext, DetailedPageActivity::class.java)
                                )
                            }
                            .requiredHeight(height = 52.dp))
                    Text(
                        text = "Promotions",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(fontSize = 30.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 5.dp,
                                y = 315.dp)
                            .requiredWidth(width = 201.dp)
                            .requiredHeight(height = 52.dp))
                    Text(
                        text = "Popular",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 30.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 28.dp,
                                y = 530.dp))

                    Image(
                        painter = painterResource(id = R.drawable.offer),
                        contentDescription = "",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 360.dp)
                            .requiredWidth(width = 600.dp)
                            .requiredHeight(height = 170.dp))
                    Image(
                        painter = painterResource(id = R.drawable.rectangle8),
                        contentDescription = "Rectangle 8",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 17.dp,
                                y = 566.dp)
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 200.dp)
                            .clip(shape = RoundedCornerShape(20.dp)))
                    Image(
                        painter = painterResource(id = R.drawable.rectangle8),
                        contentDescription = "Rectangle 9",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 196.dp,
                                y = 566.dp)
                            .requiredWidth(width = 163.dp)
                            .requiredHeight(height = 200.dp)
                            .clip(shape = RoundedCornerShape(20.dp)))
                    Image(
                        painter = painterResource(id = R.drawable.pngwing4),
                        contentDescription = "pngwing 4",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 31.dp,
                                y = 566.dp)
                            .clickable {
                                localContext.startActivity(
                                    Intent(localContext, DetailedPageActivity::class.java)
                                )
                            }
                            .requiredWidth(width = 141.dp)
                            .requiredHeight(height = 126.dp))
                    Text(
                        text = "Beef Burger",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 44.dp,
                                y = 692.dp))
                    Text(
                        text = "Cheese Pizza",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 218.dp,
                                y = 684.dp))
                    Text(
                        text = "£20",
                        color = Color(0xff8d27dd),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 33.dp, y = 719.dp)
                            .requiredWidth(width = 65.dp)
                            .requiredHeight(height = 34.dp))
                    Text(
                        text = "£70",
                        color = Color(0xff8d27dd),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 206.dp, y = 722.dp)
                            .requiredWidth(width = 65.dp)
                            .requiredHeight(height = 34.dp))

                    Image(
                        painter = painterResource(id = R.drawable.pngwing5),
                        contentDescription = "pngwing 5",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 199.dp,
                                y = 597.dp)
                            .clickable {
                                localContext.startActivity(
                                    Intent(localContext, DetailedPageActivity::class.java)
                                )
                            }
                            .requiredWidth(width = 157.dp)
                            .requiredHeight(height = 69.dp))

                }
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()

    val context = LocalContext.current

    if (Build.VERSION.SDK_INT >= 23) {
        if (ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            Log.d("hhhh", "Permissions not granted")
            Toast.makeText(context, "This app needs the Location permission, Accept to use location functionality", Toast.LENGTH_SHORT).show()

            // ask for permission
            ActivityCompat.requestPermissions(Activity(), arrayOf( Manifest.permission.ACCESS_FINE_LOCATION), 1)
        }else{
            Toast.makeText(context, "Location permission, Accepted", Toast.LENGTH_SHORT).show()
        }
    }


}