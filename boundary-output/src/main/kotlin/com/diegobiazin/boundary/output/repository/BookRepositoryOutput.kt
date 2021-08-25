package com.diegobiazin.boundary.output.repository

import com.diegobiazin.boundary.output.repository.DTO.BookOutput


interface BookRepositoryOutput {
    fun findAll(): List<BookOutput>
}
