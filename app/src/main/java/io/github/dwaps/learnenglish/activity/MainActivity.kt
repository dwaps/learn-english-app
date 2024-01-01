package io.github.dwaps.learnenglish.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.dwaps.learnenglish.R
import io.github.dwaps.learnenglish.ui.theme.LearnEnglishTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnEnglishTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Header()
                    TitleBloc()
                    Footer()
                }
            }
        }
    }
}

@Composable
fun Header() {
    val middleScreen = LocalConfiguration.current.screenWidthDp / 2;
    Row {
        Column(
            modifier = Modifier
                .width((middleScreen+10).dp)
                .background(colorResource(id = R.color.blue_vocabulary))
        ) {
            Text(
                text = "Vocabulaire",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 50.dp)
            )
        }
        Column {
            Column(
                modifier = Modifier
                    .width(middleScreen.dp)
                    .background(colorResource(id = R.color.orange_grammar))
            ) {
                Text(
                    text = "Grammaire",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 30.dp)
                )
            }
            Column(
                modifier = Modifier
                    .width(middleScreen.dp)
                    .background(colorResource(id = R.color.red_verbs))
            ) {
                Text(
                    text = "Verbes",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 30.dp)
                )
            }
        }
    }
}

@Composable
fun TitleBloc() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        TitleBlocText(text = "Apprendre")
        TitleBlocText(
            text = "l'Anglais",
            dir = TextAlign.End
        )
        Spacer(modifier = Modifier.height(30.dp))
        Icon(
            Icons.Rounded.Settings,
            contentDescription = "Paramètres",
            Modifier.size(30.dp)
        )
    }
}

@Composable
fun TitleBlocText(text: String, dir: TextAlign = TextAlign.Start) {
    Text(
        text = text,
        textAlign = dir,
        fontSize = 28.sp,
        fontFamily = FontFamily(Font(R.font.comfortaa)),
        modifier = Modifier.width(200.dp)
    )
}

@Composable
fun Footer() {
    Column(verticalArrangement = Arrangement.Bottom) {
        Text(
            text = "Michaël Cornillon",
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        )
    }
}

@Preview(name = "Light Mode")
//@Preview(
//    name = "Dark Mode",
//    showSystemUi = false,
//    uiMode = Configuration.UI_MODE_NIGHT_YES
//)
@Composable
fun HomePagePreview() {
    LearnEnglishTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Header()
            TitleBloc()
            Footer()
        }
    }
}
