package com.bookapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookapp.model.Book;
@Repository
public class BookRepositoryImpl implements IBookRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void addBook(Book book) {
		Object[] objArray= {book.getBookTitle(),book.getAuthor(),book.getCategory(),book.getPrice(),book.getBookId()};
	jdbcTemplate.update(Queries.INSERTQUERY,objArray);	
}
	@Override
	public void updateBook(int bookId,double price) {
		jdbcTemplate.update(Queries.UPDATEQUERY,price,bookId);
	}
	@Override
	public void deleteBook(int bookId) {
		jdbcTemplate.update(Queries.DELETEQUERY,bookId);
	}
	@Override
	public List<Book> findAll() {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> books = jdbcTemplate.query(Queries,SELECTQUERY,mapper);
		reurn books;
	}
	@Override
	public List<Book> findByAuthorStartsWith(String author) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> booksByAuthor = jdbcTemplate.query(Queries,SELECTBYAUTHORQUERY,mapper,author);
		reurn booksByAuthor;
	}
	@Override
	public List<Book> findAll() {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> books = jdbcTemplate.query(Queries,SELECTQUERY,mapper);
		reurn books;
	}
	@Override
	public List<Book> findAll() {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> books = jdbcTemplate.query(Queries,SELECTQUERY,mapper);
		reurn books;
	}
	@Override
	public List<Book> findAll() {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> books = jdbcTemplate.query(Queries,SELECTQUERY,mapper);
		reurn books;
	}
}
		
		
		