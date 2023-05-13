package com.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.utils.Result;
import com.example.domain.Book;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

//    @GetMapping
//    public Result getAll(){
//        return new Result(true,bookService.list());
//    }

    @GetMapping("{id}")
    public Result getBook(@PathVariable Integer id){
        return new Result(true,bookService.getById(id));
    }

    @PutMapping
    public Result update(@RequestBody Book book){
        return new Result(bookService.updateBook(book));
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id){
        return new Result(bookService.deleteBook(id));
    }

    @PostMapping
    public Result save(@RequestBody Book book){
        return new Result(bookService.saveBook(book));
    }

//    查询条件展示    http://localhost:8083/books/1/10?bookName=&type=&description=
    @GetMapping("{current}/{size}")
    public Result getPage(@PathVariable Integer current,@PathVariable Integer size,Book book){
        IPage<Book> page = bookService.getPage(current,size,book);
        System.out.println(page.getPages());
//        如果当前页码大于总页码数，重新进行查询操作
        if(current > page.getPages()){
//            System.out.println(page.getPages());
            return new Result(true,bookService.getPage((int) page.getPages(),size,book));
        }
        else {
            return new Result(true,page);
        }
    }
}
