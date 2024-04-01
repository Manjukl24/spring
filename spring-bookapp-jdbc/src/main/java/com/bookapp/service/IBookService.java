package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {

    List<com.bookapp.model.Book> getAll();
    List<Book> getByAuthorStartWith(String author)throws BookNotFoundException;
    List<Book> getByCategory(String category)throws BookNotFoundException;
    List<Book> getByPriceLessThan(double price) throws BookNotFoundException;
    List<Book> getByAuthorContainsAndCategory(String author,String category)throws BookNotFoundException;
    List<Book> getId(int bookId) throws IdNotFoundException;
	com.bookapp.model.Book getById(int bookId) throws IdNotFoundException;
}
