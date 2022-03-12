package com.example.sdjpaintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sdjpaintro.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
