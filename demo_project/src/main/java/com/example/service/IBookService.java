package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Book;

import java.util.List;

public interface IBookService extends IService<Book> {
    boolean saveBook(Book book);
    boolean deleteBook(Integer id);
    boolean updateBook(Book book);
    IPage<Book> getPage(int current,int size);
    IPage<Book> getPage(int current,int size,Book book);
}
