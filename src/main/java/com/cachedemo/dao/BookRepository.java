package com.cachedemo.dao;

import com.cachedemo.model.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);
}
