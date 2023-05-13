package com.itheima.domain;


public class Book {
    private Integer id;
    private String  type;
    private String  bookName;
    private String  description;
    private Integer deleted;
    private Integer version;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", bookName='" + bookName + '\'' +
                ", description='" + description + '\'' +
                ", deleted=" + deleted +
                ", version=" + version +
                '}' +'\n';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
