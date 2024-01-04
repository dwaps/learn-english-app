package io.github.dwaps.learnenglish.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.dwaps.learnenglish.R
import io.github.dwaps.learnenglish.ui.common.ButtonsBar
import io.github.dwaps.learnenglish.ui.common.SpecificTitle

@Composable
fun VerbsPage() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()
    ) {
        SpecificTitle(R.string.verbs_title, "Mother")
        TranslationBlock()
        Spacer(modifier = Modifier.weight(1F))
        ButtonsBar()
    }
}

@Composable
fun TranslationBlock() {
    Text(text = "ANGLAIS")
    Text(
        text = "The mother is in the kitchen", fontSize = 18.sp
    )
    Spacer(modifier = Modifier.height(30.dp))
    Text(text = "FRANÇAIS")
    Text(
        text = "La mère est dans la cuisine", fontSize = 18.sp
    )
}

@Preview(
    showSystemUi = true, showBackground = true
)
@Composable
fun VerbsPagePreview() {
    VerbsPage()
}