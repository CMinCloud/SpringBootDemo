package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookDao  {

    @Select("select * from tbl_book")
    @ResultMap("BookResultMap")
    public List<Book> getAll();

    public Book getBookById(Integer id);
}
