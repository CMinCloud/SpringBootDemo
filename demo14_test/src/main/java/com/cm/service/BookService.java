package com.cm.service;

import com.cm.domain.Book;
import org.springframework.stereotype.Service;

public interface BookService {

    public Boolean save(Book book);
}
