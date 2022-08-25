package com.offensivelybad.coffeemasters

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.offensivelybad.coffeemasters.ui.theme.CoffeeMastersTheme

@Composable
fun Offer(title: String, description: String) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.background_pattern),
            contentScale = ContentScale.FillWidth,
            contentDescription = null,
            modifier = Modifier
                .height(185.dp)
                .fillMaxWidth()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = description,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.tertiary)
                    .padding(16.dp)
            )
        }
    }
}

@Composable
fun OffersPage() {
    Column(
        Modifier.verticalScroll(rememberScrollState())
    ) {
        Offer("new offer", "this is a cool offer")
        Offer("blue stuff", "I don't know what I'm talking about")
        Offer("new stuff", "I don't know how but it does")
    }
}

@Preview(showBackground = true)
@Composable
private fun OffersPage_Preview() {
    OffersPage()
}

@Preview(showBackground = true, widthDp = 400)
@Preview(showBackground = true, widthDp = 400, uiMode = UI_MODE_NIGHT_YES, name = "dark mode")
@Composable
private fun Offer_Preview() {
    CoffeeMastersTheme {
        Offer("my title", "my description")
    }
}