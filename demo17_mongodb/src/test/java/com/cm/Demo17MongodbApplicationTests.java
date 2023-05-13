package com.cm;

import com.cm.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.ListIterator;

@SpringBootTest
class Demo17MongodbApplicationTests {

    @Resource
    private MongoTemplate mongoTemplate;

    @Test
    void test(){
        Book book = new Book();
        book.setBookId(5);
        book.setDescription("description...");
        book.setBookName("bookName...");
        book.setType("Type...");
        mongoTemplate.save(book);
    }

    @Test
    void test2(){
        List<Book> all = mongoTemplate.findAll(Book.class);
/*
        for (Book book: all
             ) {
            System.out.println(book);
        }
*/
        all.forEach(System.out::println);
    }

}
