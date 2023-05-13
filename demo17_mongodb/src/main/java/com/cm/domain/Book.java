package com.cm.domain;

import lombok.Data;

@Data
public class Book {
    private Integer bookId;
    private String type;
    private String bookName;
    private String description;
}
