package io.github.dwaps.learnenglish.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import io.github.dwaps.learnenglish.R
import io.github.dwaps.learnenglish.models.ListItem
import io.github.dwaps.learnenglish.models.listItems

sealed class BottomNavItem(val route: String, val icon: ImageVector, @StringRes var label: Int) {
    data object Vocabulary :
        BottomNavItem("vocabulary", Icons.Default.Home, R.string.vocabulary_title)

    data object Grammar : BottomNavItem("grammar", Icons.Default.Search, R.string.grammar_title)
    data object Verbs : BottomNavItem("verbs", Icons.Default.Person, R.string.verbs_title)
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    BottomNavigation {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val items = listOf(
            BottomNavItem.Vocabulary,
            BottomNavItem.Grammar,
            BottomNavItem.Verbs
        )

        items.forEach { item ->
            BottomNavigationItem(
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                },
                icon = { Icon(item.icon, contentDescription = null) },
                label = { Text(text = stringResource(id = item.label)) })
        }
    }
}

@Composable
fun NavigationHost(navController: NavController, padding: PaddingValues) {
    NavHost(
        navController as NavHostController,
        startDestination = BottomNavItem.Vocabulary.route,
        modifier = Modifier.padding(padding)
    ) {
        composable(BottomNavItem.Vocabulary.route) {
            // TODO: Change specific list to common list
            ListVocabulary(listItems)
        }
        composable(BottomNavItem.Grammar.route) {
            // TODO: Change specific list to common list
            ListVocabulary(listItems)
        }
        composable(BottomNavItem.Verbs.route) {
            VerbsPage()
        }
    }
}

@Composable
fun ListPage() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomNavigationBar(navController) }) { innerPadding ->
        NavigationHost(navController, innerPadding)
    }
}

@Composable
fun ListVocabulary(listItems: List<ListItem>, isGrammarRulesList: Boolean = false) {
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
                    Text(
                        text = li.subTitle,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )
                }
                if (isGrammarRulesList) Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_star_border_24),
                        contentDescription = stringResource(R.string.content_description_favorite),
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
    val navController = rememberNavController()
//    ListPage(listItems)
    Scaffold(bottomBar = { BottomNavigationBar(navController) }) { innerPadding ->
        NavigationHost(navController, innerPadding)
    }
}
