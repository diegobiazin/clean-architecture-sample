package com.diegobiazin.boundary.input.usecase

import com.diegobiazin.boundary.input.usecase.dto.BookInput

interface FindAllBooksInput {
    fun execute(): List<BookInput>
}