package com.example.livros.repository;

import java.util.HashMap;

import com.example.livros.model.Book;

import org.springframework.stereotype.Repository;

/**
 * BookReposity
 */
@Repository
public class BookReposity {

    public HashMap<Integer,Book> rp = new HashMap<Integer,Book>() ;
    private int count = 0;

    /* 
    public BookReposity() {
        rp.put(1, new Book(1, "Nome", "Autor", 1, 5,10.0));
    }*/

    public void addBook(Book book)
    {
        rp.put(count++, book);
    }

    public HashMap<Integer,Book> getBook()
    {
        return rp;
    }
}