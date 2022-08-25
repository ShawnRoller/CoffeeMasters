package com.offensivelybad.coffeemasters

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun App() {
    Scaffold(

        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary),
                title = { AppTitle() },
                modifier = Modifier
                    .background(Color.Cyan)

            )
        }
    ) {
        OffersPage()
    }
}

@Preview
@Composable
fun AppTitle() {
    Box(
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentScale = ContentScale.Fit,
            contentDescription = "Coffee Masters Logo",
        )
    }
}
