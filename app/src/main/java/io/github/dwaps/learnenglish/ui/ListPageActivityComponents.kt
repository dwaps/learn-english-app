package io.github.dwaps.learnenglish.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.dwaps.learnenglish.R
import io.github.dwaps.learnenglish.models.ListItem
import io.github.dwaps.learnenglish.models.listItems


@Composable
fun ListPage(listItems: List<ListItem>, isGrammarRulesList: Boolean = false) {
    LazyColumn {
        items(listItems) { li ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .height(130.dp)
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 1.dp),
                    modifier = Modifier
                        .weight(5F)
                        .height(120.dp)
                        .padding(start = 5.dp, end = 5.dp)
                ) {
                    Text(text = li.title, fontSize = 28.sp, modifier = Modifier.padding(10.dp))
                    Text(text = li.subTitle, fontSize = 20.sp, modifier = Modifier.padding(10.dp))
                }
                if (isGrammarRulesList) Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_star_border_24),
                        contentDescription = "Favori",
                        modifier = Modifier
                            .weight(1F)
                            .size(34.dp)
                    )
                }
            }
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun ListPagePreview() {
    ListPage(listItems)
}
