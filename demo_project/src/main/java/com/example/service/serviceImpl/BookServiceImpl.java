package com.example.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao,Book> implements IBookService {

    @Autowired
    private BookDao bookDao;

    public boolean saveBook(Book book){
        return bookDao.insert(book) > 0;
    }

    public boolean deleteBook(Integer id){
        return  bookDao.deleteById(id) > 0;
    }

    public boolean updateBook(Book book){
        return  bookDao.updateById(book) > 0;
    }

    /**
     * 初始时打开
     * @param current
     * @param size
     * @return
     */
    public IPage<Book> getPage(int current,int size){
        IPage<Book> page = new Page<Book>(current,size);
        bookDao.selectPage(page,null);
        return page;
    }

    /**
     * 按条件查询时打开
     */
    public IPage<Book> getPage(int current,int size,Book book){
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
//        先判断条件是否为空，为空则不进行条件筛选
        lqw.like(!book.getType().isEmpty(),Book::getType,book.getType());
        lqw.like(!book.getBookName().isEmpty(),Book::getBookName,book.getBookName());
        lqw.like(!book.getDescription().isEmpty(),Book::getDescription,book.getDescription());
        IPage<Book> page = new Page<>(current,size);
//        使用分页查询！！！！
        bookDao.selectPage(page,lqw);
        return page;
    }
}
