package com.iamabhi_07.learnrestapi.storeServices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.iamabhi_07.learnrestapi.entities.Book;

@Component
public class BookServices {

    private static List<Book> list = new ArrayList<>();

    static{
        list.add(new Book(123,"Let us c","All resources of c programming language.","ABL",459));
        list.add(new Book(124,"C with classes","All resources of c programming language with classes.","KOP",910));
        list.add(new Book(125,"C++","All resources of c programming language.","MML",256));
        list.add(new Book(126,"Learn Java","All resources of java programming language.","UUI",366));
        list.add(new Book(127,"Learn Python","All resources of python programming language.","SSD",785));
    }

    // Get all books
    public List<Book> getAllBooks(){
        return list;
    }
    
    // Get one book by Id
    public Book getBookById(int bId){
        Book book = null;
        book = list.stream().filter(e->e.getbId() == bId).findFirst().get();
        return book;
    }

    // Add new book
    public Book addBook(Book bk){
        list.add(bk);
        return bk;
    }

    // Delete book using id
    public void deleteBook(int bId){
        list = list.stream().filter(book->book.getbId()!=bId).collect(Collectors.toList());
    }

    // Update the fields of book info
    public void updateBook(Book book, int bId){
        list = list.stream().map(b->{
            if(b.getbId() == bId){
                b.setbTitle(book.getbTitle());
                b.setbPrice(book.getbPrice());
            }
            return b;
        }).collect(Collectors.toList());
    }
}
