package io.github.dwaps.learnenglish.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import io.github.dwaps.learnenglish.ui.Footer
import io.github.dwaps.learnenglish.ui.Header
import io.github.dwaps.learnenglish.ui.TitleBlock
import io.github.dwaps.learnenglish.ui.theme.LearnEnglishTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnEnglishTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Header()
                    TitleBlock()
                    Footer()
                }
            }
        }
    }
}
