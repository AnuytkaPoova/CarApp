package ru.marslab.movedcar.presentation.mainscreen.model

import androidx.compose.ui.unit.DpOffset

data class MainScreenState(
    val startPosition: DpOffset = DpOffset.Zero,
    val stopPosition: DpOffset = DpOffset.Zero
)
