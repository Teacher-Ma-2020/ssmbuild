package com.jie.service;

import com.jie.dao.BookMapper;
import com.jie.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class BookServiceImpl implements BookService {

//    service层调dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBook(int bookID) {
        return bookMapper.deleteBook(bookID);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public List<Books> queryNameBook(String name) { return bookMapper.queryNameBook(name); }

    public Books queryBook(int bookID) {
        return bookMapper.queryBook(bookID);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
