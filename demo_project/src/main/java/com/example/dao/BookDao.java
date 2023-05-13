package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookDao extends BaseMapper<Book> {

//    @Select("select * from tbl_book")
//    public List<Book> getAll();
//
//    @Select("select * from tbl_book where book_id = #{id})")
//    public Book getBookById(Integer id);
}
