package com.recipes.app_compose.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun LoadingWidget() {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        HorizontalDottedProgress()
    }
}
