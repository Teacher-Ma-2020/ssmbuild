package com.jie.controller;

import com.jie.pojo.Books;
import com.jie.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    private String list(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list",books);
        return "allbook";
    }

    @RequestMapping("/addBook")
    public String toAddpage(){
        return "addBook";
    }

    @RequestMapping("/insertBook")
    public String Addpage(Books books){
        System.out.println("addbook"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdate/{i}")
    public String toUpdate(@PathVariable("i") int i, Model model){
        Books book = bookService.queryBook(i);
        System.out.println(book+"111");
        model.addAttribute("book",book);
        return "updateBook";
    }

    @RequestMapping("/Update/{id}")
    public String Update(@PathVariable("id") int id,Books books){
        books.setBookID(id);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        bookService.deleteBook(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public String queryBook(Model model,String queryName){
        List<Books> list = bookService.queryNameBook(queryName);
        model.addAttribute("list",list);
        return "allbook";
    }
}
