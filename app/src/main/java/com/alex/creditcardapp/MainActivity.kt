package com.alex.creditcardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alex.creditcardapp.ui.theme.CreditCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayCards()
                }
            }
        }
    }
}

@Composable
fun DisplayCards(){
    val cards = listOf(
        CardInfo("5555 6666 7777 8888", "John Doe", R.drawable.mastercard, R.drawable.card1),
        CardInfo("4444 3333 2222 1111", "Joan Smith", R.drawable.mastercard, R.drawable.card2),
        CardInfo("1234 5678 9012 3456", "Alice Wanderer", R.drawable.visa, R.drawable.card3),
        CardInfo("9876 5432 1098 7654", "Mikhael Clever", R.drawable.visa, R.drawable.card4),
        CardInfo("1122 3344 5566 7788", "Chris Adams", R.drawable.mastercard, R.drawable.card5),
        CardInfo("2233 4455 6677 8899", "Eva Bright", R.drawable.visa, R.drawable.card6)
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    )
    {
        items(cards){
            CreditCard(cardInfo = it)
        }
    }
}