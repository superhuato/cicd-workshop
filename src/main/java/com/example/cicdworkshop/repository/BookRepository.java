package com.example.cicdworkshop.repository;

import com.example.cicdworkshop.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
