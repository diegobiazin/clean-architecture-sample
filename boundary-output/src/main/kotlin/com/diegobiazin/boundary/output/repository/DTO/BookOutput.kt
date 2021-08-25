package com.diegobiazin.boundary.output.repository.DTO

import java.util.*

data class BookOutput(
    val id: UUID,
    val author: String,
    val title: String
)