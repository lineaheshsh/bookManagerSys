package com.yescnc.book.controller;

import java.awt.print.Book;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yescnc.book.service.BookService;

@Controller
public class BookController {
	
	@Resource(name="BookService")
	private BookService service;
	
	@RequestMapping(value="/addBook.do")
	public String addBook(Book book) {
		
		return null;
	}
	
	public String updateBook(Book book) {
			
		return null;
	}
	
	public String deleteBook(Book book) {
		
		return null;
	}
	
	public String deleteAllBook() {
		
		return null;
	}
	
	@RequestMapping(value="/allBookList.do", method = RequestMethod.GET)
	public String getAllBooks(Model model ) {
		
		System.out.println("155523");
		
		List<Book> allBooks = null;
		
		allBooks = service.getAllBooks();
		
		model.addAttribute("contents", allBooks);
		
		
		return "home";
	}
	
	public String getByBookName(String BookName) {
		
		return null;
	}
}
