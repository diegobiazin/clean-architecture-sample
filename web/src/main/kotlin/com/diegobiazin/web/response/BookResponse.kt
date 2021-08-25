package com.diegobiazin.web.response

import java.util.*

data class BookResponse(
    val id: UUID,
    val author: String,
    val title: String
)