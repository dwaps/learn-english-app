package io.github.dwaps.learnenglish.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.dwaps.learnenglish.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}

@Composable
fun HomePage() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        HomeBlocTitle(text = "Apprendre", dir = TextAlign.Start)
        HomeBlocTitle(text = "l'Anglais", dir = TextAlign.End)
    }
}

@Composable
fun HomeBlocTitle(text: String, dir: TextAlign) {
    Text(
        text = text,
        textAlign = dir,
        fontSize = 28.sp,
        fontFamily = FontFamily(Font(R.font.comfortaa)),
        modifier = Modifier.width(200.dp)
    )
}

@Preview(
    showSystemUi = true
)
@Composable
fun HomePagePreview() {
    HomePage()
}