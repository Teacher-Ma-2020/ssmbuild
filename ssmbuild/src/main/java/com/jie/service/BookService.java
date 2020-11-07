package com.jie.service;

import com.jie.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    int addBook(Books books);
    int deleteBook(int bookID);
    int updateBook(Books books);
    Books queryBook(int bookID);
    List<Books> queryAllBook();
    List<Books> queryNameBook(String name);

}
