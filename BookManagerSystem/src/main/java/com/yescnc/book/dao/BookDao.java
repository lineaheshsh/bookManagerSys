package com.yescnc.book.dao;

import java.awt.print.Book;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BookDao {
	@Autowired
	private SqlSessionFactory factory;

	public void setFactory(SqlSessionFactory factory) {
		this.factory = factory;
	}

	public SqlSessionFactory getFactory() {
		return factory;
	}
	
	public int addBook(Book book) {
		
		return 0;
	}
	
	public int updateBook(Book book) {
			
		return 0;
	}
	
	public int deleteBook(Book book) {
		
		return 0;
	}
	
	public int deleteAllBook() {
		
		return 0;
	}
	
	public List<Book> getAllBooks() {
		SqlSession session =  factory.openSession(true);
		List<Book> allBooks = null;
		
		allBooks = session.selectList("com.yescnc.book.mapper.getAllBooks");
		
		return allBooks;
	}
	
	public List<Book> getByBookName(String BookName) {
		
		return null;
	}
}
