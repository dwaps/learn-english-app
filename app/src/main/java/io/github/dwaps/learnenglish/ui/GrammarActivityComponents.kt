package io.github.dwaps.learnenglish.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.dwaps.learnenglish.R
import io.github.dwaps.learnenglish.ui.common.SpecificTitle

@Composable
fun GrammarPage() {

    val grammarList = listOf(
        "Le verbe to be s'emploie...",
        "Mais il ne faut pas...",
        "Cependant...",
        "Bon, après..."
    )

    Column {
        SpecificTitle(R.string.grammar_title, subTitle = "Le verbe to be")
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            items(grammarList.size) {
                Text(
                    text = grammarList.get(it),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(18.dp)
                )
            }
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun GrammarPagePreview() {
    GrammarPage()
}