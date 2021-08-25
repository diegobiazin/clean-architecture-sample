package com.diegobiazin.usecase

import com.diegobiazin.boundary.input.usecase.FindAllBooksInput
import com.diegobiazin.boundary.input.usecase.dto.BookInput
import com.diegobiazin.boundary.output.repository.BookRepositoryOutput
import org.springframework.stereotype.Service

@Service
class FindAllBooksUseCase(
    private val bookRepositoryOutput: BookRepositoryOutput
) : FindAllBooksInput {

    override fun execute(): List<BookInput> {
        return bookRepositoryOutput.findAll().map { BookInput(it.id, it.author, it.title) }
    }
}
