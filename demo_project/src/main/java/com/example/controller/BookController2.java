package com.example.controller;

import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books2")
public class BookController2 {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @PutMapping
    public String update(@RequestBody Book book){
        if(bookService.Update(book) == 1)
            return "更新成功";
        else return "更新失败";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable Integer id){
        if(bookService.deleteById(id) == 1)
            return "删除成功";
        else return "删除失败";
    }

    @PostMapping
    public String save(@RequestBody Book book){
        if(bookService.saveBook(book) == 1)
            return "添加成功";
        else return "添加失败";
    }

    @GetMapping("/{type}")
    public List<Book> selectByType(@PathVariable String type){
        List<Book> bookList = bookService.selectByType(type);
        if(bookList != null || ! bookList.isEmpty()){
            return bookList;
        }
        return null;
    }

    @GetMapping("/{name}")
    public List<Book> selectByName(@PathVariable String name){
        List<Book> bookList = bookService.selectByBookName(name);
        if(bookList != null || ! bookList.isEmpty()){
            return bookList;
        }
        return null;
    }

    @GetMapping("/{dep}")
    public List<Book> selectByDescription(@PathVariable String dep){
        List<Book> bookList = bookService.selectByDep(dep);
        if(bookList != null || ! bookList.isEmpty()){
            return bookList;
        }
        return null;
    }

    @GetMapping("{current}/{size}")
    public List<Book> getPages(@PathVariable Integer current,@PathVariable Integer size){
        List<Book> bookList = bookService.getPages(current, size);
        if(bookList != null || ! bookList.isEmpty()){
            return  bookList;
        }
        return null;
    }
}
