package com.iamabhi_07.learnrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iamabhi_07.learnrestapi.entities.Book;
import com.iamabhi_07.learnrestapi.storeServices.BookServices;

@RestController
public class storeController {

    // Creating object of bookservice class
    @Autowired
    private BookServices bookServices;

    // Get handler
    @GetMapping("/store")
    public List<Book> getBooks(){

        // Book book = new Book();
        // book.setbId(107);
        // book.setbName("Spring Boot Complete Guide");
        // book.setbAuthor("A Complete Resource Book For Spring Boot. ");
        // book.setbAuthor("James Gosling");
        // book.setbPrice(389);

        // return book;
        // return "This is the book store." +"\n" +"Welcome";

        return this.bookServices.getAllBooks();
    }

    // Get handler by id
    @GetMapping("/store/{id}")
    public Book getBook(@PathVariable("id") int id){
        return bookServices.getBookById(id);
    }

    // Post handler 
    @PostMapping("/store")
    public Book addBook(@RequestBody Book book){
        Book b = this.bookServices.addBook(book);
        return b;
    }

    // Delete handler
    @DeleteMapping("/store/{bId}")
    public void deleteBook(@PathVariable("bId") int bId){
        this.bookServices.deleteBook(bId);
    }

    // Update handler
    @PutMapping("/store/{bId}")
    public Book updateBook(@RequestBody Book book,@PathVariable("bId") int bId){
        this.bookServices.updateBook(book, bId);
        return book;
    }
}
