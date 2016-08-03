package com.yescnc.book.service;

import java.awt.print.Book;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yescnc.book.dao.BookDao;

@Service(value="BookService")
public class BookService {

	@Resource(name="bookDao")
	private BookDao dao;
	
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
		
		List<Book> allBooks = null;
		
		allBooks = dao.getAllBooks();
		
		return allBooks;
	}
	
	public List<Book> getByBookName(String BookName) {
		
		return null;
	}
}
