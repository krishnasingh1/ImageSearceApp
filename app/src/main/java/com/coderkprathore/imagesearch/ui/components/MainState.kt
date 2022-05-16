package com.coderkprathore.imagesearch.ui.components

import com.coderkprathore.imagesearch.network.model.Hit

data class MainState(
    val isLoading : Boolean = false,
    val data: List<Hit> = emptyList(),
    val error: String = ""
)
