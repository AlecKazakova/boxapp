package app.cash.boxapp.smallboxfeature

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import app.cash.boxapp.api.BoxAppFeature

class SmallBoxFeature : BoxAppFeature {
  @Composable override fun Tile() {
    Box(
      modifier = Modifier
        .size(width = 100.dp, height = 40.dp)
        .background(Color(255, 222, 133))
        .padding(start = 10.dp, end = 10.dp),
      contentAlignment = Alignment.CenterStart
    ) {
      Text("Small Box Feature!")
    }
  }
}