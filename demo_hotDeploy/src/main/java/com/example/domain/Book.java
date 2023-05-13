package com.example.domain;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
public class Book {
    @TableId    //如果不设置@TableId注解可能出错，Mybatis-plus有特定的主键设置算法
    private Integer bookId;
    private String type;
    @TableField(value = "book_name")
    private String bookName;
    private String description;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", type='" + type + '\'' +
                ", bookName='" + bookName + '\'' +
                ", description='" + description + '\'' +
                '}'+'\n';
    }
}
