package com.pdmcourse2026.basictemplate.screens.home

import android.service.autofill.OnClickAction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
  Scaffold(
    topBar = {
      TopAppBar(
        colors = topAppBarColors(
          containerColor = MaterialTheme.colorScheme.primaryContainer,
          titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = { Text("RankeUca - Vota") },
      )
    }
  ) { innerPadding ->
    Column(modifier = Modifier
      .padding(innerPadding)
      .fillMaxSize(),
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      Text(
        text = "Seleciona por cual quieres votar",
        modifier = Modifier.padding(bottom = 16.dp)
      )
      
      Button(onClick = {
      }) {
        Text(text = "Ir a Resultados ")
      }

    }

  }
}