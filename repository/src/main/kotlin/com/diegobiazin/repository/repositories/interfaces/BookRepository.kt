package com.diegobiazin.repository.repositories.interfaces

import com.diegobiazin.repository.entity.Book
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface BookRepository : JpaRepository<Book, UUID>