package app.cash.boxapp.bigboxfeature

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable fun BigBoxScreen() {
  Box(
    modifier = Modifier
      .fillMaxSize()
      .background(Color(255, 222, 133)),
    contentAlignment = Alignment.Center
  ) {
    Text(text = "Big Box Main Screen!")
  }
}