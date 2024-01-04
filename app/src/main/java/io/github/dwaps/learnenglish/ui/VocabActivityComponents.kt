package io.github.dwaps.learnenglish.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.dwaps.learnenglish.R
import io.github.dwaps.learnenglish.ui.common.ButtonsBar
import io.github.dwaps.learnenglish.ui.common.SpecificTitle

@Composable
fun VocabPage() {
    Column {
        SpecificTitle(R.string.vocabulary_title, subTitle = "Famille")
        Card(
            modifier = Modifier.padding(10.dp),
            elevation = CardDefaults
                .cardElevation(defaultElevation = 20.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Mère".uppercase(),
                    fontSize = 24.sp,
                    modifier = Modifier.padding(24.dp)
                )
                Divider(
                    color = Color.DarkGray,
                    thickness = 5.dp
                )
                Text(
                    text = "La mère est dans la cuisine",
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(28.dp)
                )
            }
        }
        Spacer(modifier = Modifier.weight(1F))
        ButtonsBar()
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun VocabPagePreview() {
    VocabPage()
}