package app.cash.boxapp.bigboxfeature

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import app.cash.boxapp.api.ServiceRegistry
import app.cash.boxapp.bigboxfeature.api.BigBoxMainScreen

@Composable fun BigBoxScreen() {
  val widgets: MutableList<@Composable () -> Unit> = remember {
    mutableStateListOf<@Composable () -> Unit>()
  }

  ServiceRegistry.of<BigBoxMainScreen>().install(object : BigBoxMainScreen {
    override fun registerWidget(widget: @Composable () -> Unit) {
      widgets.add(widget)
    }
  })

  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(Color(255, 222, 133)),
    horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    Spacer(modifier = Modifier.weight(1f))
    Text(text = "Big Box Main Screen!")
    Spacer(modifier = Modifier.weight(1f))

    widgets.forEach {
      it()
      Spacer(modifier = Modifier.weight(1f))
    }
  }
}