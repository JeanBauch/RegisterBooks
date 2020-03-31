package com.example.livros.service;

import java.util.HashMap;

import com.example.livros.model.Book;
import com.example.livros.repository.BookReposity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BookService
 */
@Service
public class BookService {

    @Autowired
    private BookReposity br;

    public void addBook(Book book)
    {
        boolean exist = false;
        for(Book b: br.getBook().values())
        {
            if(b.getAuthor().equals(book.getAuthor()))
            {
                if( b.getEdition() == book.getEdition() )
                {
                    exist = true;
                }
            }
        }
        if(!exist)
        {
            br.addBook(book);
        }
    }

    public HashMap<Integer,Book> getBook()
    {
        return br.getBook();
    }

    
}