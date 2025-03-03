package com.group.libraryapp.domain.book

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*
import javax.swing.text.html.Option

interface BookRepository : JpaRepository<Book, Long> {
    fun findByName(bookName: String): Book? // Optional<Book>
}