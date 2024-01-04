package io.github.dwaps.learnenglish.ui.common

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ButtonsBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .padding(bottom = 22.dp)
            .fillMaxWidth()

    ) {
        Button(onClick = { Log.d("", "CLICKED !!!") }) {
            Text(text = "OK")
        }
        Button(onClick = { Log.d("", "CLICKED !!!") }) {
            Text(text = "APPRENDRE")
        }
    }
}
