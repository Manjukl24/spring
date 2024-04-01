package com.bookapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import com.bookapp.model.Book;

public class BookMapper  implements RowMapper{
	
public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
	Book book = new Book(null, null, null, rowNum, rowNum);
	book.setAuthor(rs.getString("author"));
	book.setBookId(rs.getInt("book_id"));
	book.setTitle(rs.getString("title"));
	book.setCategory(rs.getString("category"));
	book.setPrice(rs.getString("price"));
	return book;
	
	}

@Override
public int[] getRowsForPaths(TreePath[] path) {
	// TODO Auto-generated method stub
	return null;
}
	}

