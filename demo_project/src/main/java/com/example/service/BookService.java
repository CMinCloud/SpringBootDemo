package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.domain.Book;

import java.util.List;

public interface BookService {

    /**
     * 查询所有
     */
    public List<Book> getAll();

    /**
     * 分页查询
     */
    public List<Book> getPages(Integer current,Integer size);

    /**
     * 修改
     */
    public int Update(Book book);

    /**
     * 删除
     */
    public Integer deleteById(Integer id);

    /**
     * 新增
     */
    public Integer saveBook(Book book);

    /**
     * 根据类型查询
     */
    public List<Book> selectByType(String type);

    /**
     * 根据名称查询
     */
    public List<Book> selectByBookName(String name);

    /**
     * 根据描述查询
     */
    public List<Book> selectByDep(String dep);
}
