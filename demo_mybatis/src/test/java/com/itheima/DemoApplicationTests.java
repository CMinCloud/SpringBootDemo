package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void getAll() {
        List<Book> bookList = bookDao.getAll();
        System.out.println(bookList);
    }

    @Test
    void getById(){
        Book book = bookDao.getBookById(1);
        System.out.println(book);
    }

}
