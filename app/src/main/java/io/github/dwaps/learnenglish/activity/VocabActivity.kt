package io.github.dwaps.learnenglish.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import io.github.dwaps.learnenglish.ui.VocabPage
import io.github.dwaps.learnenglish.ui.theme.LearnEnglishTheme

class VocabActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnEnglishTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    VocabPage()
                }
            }
        }
    }
}