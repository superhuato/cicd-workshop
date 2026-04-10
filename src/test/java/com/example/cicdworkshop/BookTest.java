package com.example.cicdworkshop;

import com.example.cicdworkshop.entity.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    @Test
    void shouldCreateBookWithTitleAndAuthor() {
        Book book = new Book("Clean Code", "Robert C. Martin");
        assertEquals("Clean Code", book.getTitle());
        assertEquals("Robert C. Martin", book.getAuthor());
    }
}
