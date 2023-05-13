package com.example;

import com.example.dao.BookDao;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoMybatisplusApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void getAll() {
        List<Book> bookList = bookDao.getAll();
        System.out.println(bookList);
    }

    @Test
    void getById(){
        Book book = bookDao.selectById(12);
        System.out.println(book);
    }

}
