package com.example.domain;
import com.baomidou.mybatisplus.annotation.*;

@TableName("tbl_book")
public class Book {
    @TableId(value = "book_id",type = IdType.AUTO )    //争对主键字段的匹配,设置自增策略
    private Integer bookId;
    @TableField(value = "type",select = false)   // 当前属性对应的数据库字段查询不显示
    private String type;
    @TableField(value = "book_name")
    private String bookName;
    private String description;
    @TableField(exist = false)   //当前属性不存在数据库表对应字段，为该类独立使用
    private Boolean flag;
    //    设置逻辑字段deleted,若为1则代表已经删除,
//    之后执行删除操作则会修改数据库中deleteFlag为1
    @TableField(value = "deleteFlag")
//    @TableLogic(value = "0",delval = "1")
    private Integer deleted;
    @Version   //锁的实现：修改version后version+1
    private Integer version;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", type='" + type + '\'' +
                ", bookName='" + bookName + '\'' +
                ", description='" + description + '\'' +
                ", deleted=" + deleted +
                ", version=" + version +
                '}' +'\n';
    }

    public Integer getId() {
        return bookId;
    }

    public void setId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDeleteFlag() {
        return deleted;
    }

    public void setDeleteFlag(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
