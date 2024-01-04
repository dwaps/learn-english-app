package io.github.dwaps.learnenglish.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import io.github.dwaps.learnenglish.ui.VerbsPage
import io.github.dwaps.learnenglish.ui.theme.LearnEnglishTheme

class VerbsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnEnglishTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    VerbsPage()
                }
            }
        }
    }
}