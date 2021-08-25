package com.diegobiazin.boundary.input.usecase.dto

import java.util.*

data class BookInput(
    val id: UUID,
    val author: String,
    val title: String
)
