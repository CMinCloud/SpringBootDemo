package com.cm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cm.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {

//    @Select("select * from tbl_book")
//    public List<Book> getAll();
//
//    @Select("select * from tbl_book where book_id = #{id})")
//    public Book getBookById(Integer id);
}
