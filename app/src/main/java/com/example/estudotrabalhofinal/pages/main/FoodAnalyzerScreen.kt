package com.example.estudotrabalhofinal.pages.main

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FoodAnalyzerScreen() {
    var searchQuery by remember { mutableStateOf("") }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Título e campo de busca
        item {
            TextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("Enter food item or scan barcode...") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) }
            )
        }

        // Botões SCAN e LOOK UP
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Botão "SCAN FOOD ITEM"
                // Botão "LOOK UP FOOD"
            }
        }

        // Seção "RECENT SEARCHES"
        item {
            // LazyRow com FilterChips (Apple, Chicken Breast...)
        }

        // Seção "NUTRITIONAL FACTS"
        item {
            // Card com Column e Rows para cada fato nutricional
            // Usar Spacer(Modifier.weight(1f)) para alinhar os valores à direita
        }
    }
}