package com.example.livros.controller;

import java.util.HashMap;

import com.example.livros.model.Book;
import com.example.livros.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * BookController
 */
@Controller
@RequestMapping("/app")
public class BookController {

    @Autowired
    private BookService bs;

    @GetMapping("/allBooks")
    public ModelAndView listBook()
    {
        ModelAndView mv = new ModelAndView("bookView");
        HashMap<Integer,Book> books = bs.getBook();
        mv.addObject("books", books.values());
        return mv;
    }
    
    @PostMapping("/allBooks")
    public ModelAndView registerBook(@ModelAttribute Book book)
    {
        ModelAndView mv = new ModelAndView("bookView");
        boolean error = bs.addBook(book);
        if(error)
            mv.addObject("erro",error);
        mv.addObject("books", bs.getBook().values() );
        return mv;
    }
}