package com.jie.dao;

import com.jie.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BookMapper {
    int addBook(Books books);
    int deleteBook(@Param("bookID") int bookID);
    int updateBook(Books books);
    Books queryBook(@Param("bookID")int bookID);
    List<Books> queryAllBook();
    List<Books> queryNameBook(@Param("name") String name);
}
