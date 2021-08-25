package com.diegobiazin.repository.repositories

import com.diegobiazin.boundary.output.repository.BookRepositoryOutput
import com.diegobiazin.boundary.output.repository.DTO.BookOutput
import com.diegobiazin.repository.repositories.interfaces.BookRepository
import org.springframework.stereotype.Repository

@Repository
class BookRepositoryImpl(
    private val bookRepository: BookRepository
) : BookRepositoryOutput {

    override fun findAll(): List<BookOutput> {
        return bookRepository.findAll().map { BookOutput(it.id, it.author, it.title) }
    }
}
