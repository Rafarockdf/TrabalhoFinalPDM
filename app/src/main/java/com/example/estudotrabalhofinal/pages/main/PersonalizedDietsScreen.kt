package com.example.estudotrabalhofinal.pages.main


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estudotrabalhofinal.pages.theme.*

@Composable
fun PersonalizedDietsScreen() {
    // Usar LazyColumn para conteúdo rolável
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        // Título
        item {
            Text(
                text = "YOUR PERSONALIZED DIETS",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = TextPrimary
            )
        }

        // Seção "TODAY'S PLAN"
        item {
            // Card com Row para o progresso e Column/Row para as refeições
            // Ex: Breakfast, Lunch, Dinner cards
        }

        // Botão "LOG TODAY'S MEALS"
        item {
            // Botão de gradiente
        }

        // Seção "YOUR DIET PLANS"
        item {
            // Cards para Weight Loss, Muscle Gain, etc.
        }
    }
}