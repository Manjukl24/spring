package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BookServiceImpl implements  IBookService{
    @Override
    public List<com.bookapp.model.Book> getAll() {
        List<com.bookapp.model.Book> books=BookDetails.showDetails();
        return books;
    }

    @Override
    public List<Book> getByAuthorStartWith(String author) throws BookNotFoundException {
        List<com.bookapp.model.Book> books = BookDetails.showDetails();
        List<Book> authorStartsWith = new ArrayList<>();
        for (com.bookapp.model.Book book : books) {
            if (book.getAuthor().startsWith(author)){
                authorStartsWith.addAll((Collection<? extends Book>) book);
            }
        }
if(authorStartsWith.isEmpty()){
    throw  new BookNotFoundException("Unable to Find the book author starts with");
}
        return authorStartsWith;
    }

    @Override
    public List<com.bookapp.model.Book> getByCategory(String category) throws BookNotFoundException {
        List<com.bookapp.model.Book> books = BookDetails.showDetails();
        List<Book> BooksByCategory = new ArrayList<>();
        List<com.bookapp.model.Book> newCategory;
		for (com.bookapp.model.Book categories : books) {
            if (categories.getCategory().equals(category)){
                newCategory.add(categories);
            }
        }
        if(newCategory.isEmpty()) {
            throw  new BookNotFoundException("Unable to Find the book getCategory");
        }
        return newCategory;
    }


    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<com.bookapp.model.Book> books = BookDetails.showDetails();
        List<Book> newPrices = new ArrayList<>();
        for (com.bookapp.model.Book prices: books) {
            if (prices<prices.getPrice()){
                newPrices.addAll((Collection<? extends Book>) prices);
            }
        }
        if(newPrices.isEmpty()){
            throw  new BookNotFoundException("Unable to Find the book newPrices");
        }
        return newPrices;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws Exception.BookNotFoundException {
        List<Book> books = BookDetails.showDetails();
        List<Book> autCatBy = new ArrayList<>();
        for (Book aut : books) {
            if(((com.bookapp.model.Book) aut).getAuthor().equals(author) && aut.getCategory().euals(category)) {
                autCatBy.add(aut);
            }
        }
        if(autCatBy.isEmpty()){
            throw  new BookNotFoundException("Unable to Find the Book AuthorContainsAndCategory");
        }
        return autCatBy;s
    }

    public com.bookapp.model.Book getById(int bookId) throws IdNotFoundException {
        List<com.bookapp.model.Book> books = BookDetails.showDetails();
        for (com.bookapp.model.Book newBook : books) {
            if (((com.bookapp.model.Book) newBook).getBookId() == bookId) {
                
                return  newBook;
            }
        }
            throw  new IdNotFoundException("Invalid ID");
    }

	@Override
	public List<Book> getId(int bookId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
