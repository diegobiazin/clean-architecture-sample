package com.diegobiazin.web

import com.diegobiazin.boundary.input.usecase.FindAllBooksInput
import com.diegobiazin.web.response.BookResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/admin/books")
class BookController(
    private val findAllBooksInput: FindAllBooksInput
) {

    @GetMapping
    fun findAll(): ResponseEntity<List<BookResponse>> {
        val response = findAllBooksInput.execute().map { BookResponse(it.id, it.author, it.title) }
        return ResponseEntity(response, HttpStatus.OK)
    }
}
