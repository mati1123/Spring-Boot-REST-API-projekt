package com.example.bookapi.controller;

import com.example.bookapi.model.Book;
import com.example.bookapi.repository.BookRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List; //Behövs för att hantera listor, t.ex. returnera flera böcker samtidigt


@RestController
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;

    }
    @GetMapping("/books")
    public List<Book>getAllBooks(){

        return bookRepository.findAll();
    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @GetMapping("/books/{id}")
    public Book findBook(@PathVariable Long id){
        return bookRepository.findById(id).orElse(null);
    }

    @PutMapping("/books/{id}")
    public Book replaceBook(@RequestBody Book book, @PathVariable Long id) {
        return bookRepository.findById(id)
                .map(existingBook -> {
                    existingBook.setTitle(book.getTitle());
                    existingBook.setAuthor(book.getAuthor());
                    existingBook.setPublishedDate(book.getPublishedDate());
                    return bookRepository.save(existingBook);
                })
                .orElseGet(() -> {
                    return bookRepository.save(book);
                });
    }


    @DeleteMapping("/books/{id}")
        public void deleteBook(@PathVariable Long id) {
                bookRepository.deleteById(id);
        }


    }


