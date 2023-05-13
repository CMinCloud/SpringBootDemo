package com.example.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl2 implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getAll() {
        System.out.println("service getAll...");
        return bookDao.selectList(null);
    }

    @Override
    public List<Book> getPages(Integer current,Integer size) {
        IPage<Book> page = new Page<Book>(current,size);
        bookDao.selectPage(page,null);
//        根据分页条件查询
        List<Book> list = page.getRecords();
        return list;
    }

    @Override
    public int Update(Book book) {
        return bookDao.updateById(book);
    }

    @Override
    public Integer deleteById(Integer id) {
        return bookDao.deleteById(id);
    }

    @Override
    public Integer saveBook(Book book) {
        return bookDao.insert(book);
    }

    @Override
    public List<Book> selectByType(String type) {
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like(type!="","type",type);
        return bookDao.selectList(qw);
    }

    @Override
    public List<Book> selectByBookName(String name) {
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<>();
        qw.like(name!="",Book::getBookName,name);
        return bookDao.selectList(qw);
    }

    @Override
    public List<Book> selectByDep(String dep) {
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<>();
        qw.like(dep!="",Book::getDescription,dep);
        return bookDao.selectList(qw);
    }

}
