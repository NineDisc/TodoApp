package com.ninedisc.todoapp.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ninedisc.todoapp.feature.TodoScreen

@Composable
fun TodoApp() {
    Scaffold {
        Row(modifier = Modifier.padding(it)) {
            TodoScreen()
        }
    }
}