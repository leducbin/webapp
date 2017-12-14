package com.boraji.tutorial.springboot.service;

import com.boraji.tutorial.springboot.dao.postgresql.BookRepository;
import com.boraji.tutorial.springboot.entity.postgresql.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBook(){
        List<Book> book = new ArrayList<>();
        bookRepository.findAll().forEach(book::add);
        return book;
    }

    public Book getBook(Long id)
    {
        return bookRepository.findOne(id);
    }

    public void addBook(Book book)
    {
        bookRepository.save(book);
    }

    public void updateBook(Long id, Book book)
    {
        bookRepository.save(book);
    }

    public void deleteBook(Long id)
    {
        bookRepository.delete(id);
    }
}
