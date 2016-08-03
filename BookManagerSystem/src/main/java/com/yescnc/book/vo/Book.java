package com.yescnc.book.vo;

public class Book {
	private String book_id;
	private String book_name;
	private String category;
	private String publisher;
	private String author;
	private String date;
	private String img_src;
	private String bookcase;
	private int    quantity;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String book_id, String book_name, String category, String publisher, String author, String date,
			String img_src, String bookcase, int quantity) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.category = category;
		this.publisher = publisher;
		this.author = author;
		this.date = date;
		this.img_src = img_src;
		this.bookcase = bookcase;
		this.quantity = quantity;
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getImg_src() {
		return img_src;
	}

	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}

	public String getBookcase() {
		return bookcase;
	}

	public void setBookcase(String bookcase) {
		this.bookcase = bookcase;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", category=" + category + ", publisher="
				+ publisher + ", author=" + author + ", date=" + date + ", img_src=" + img_src + ", bookcase="
				+ bookcase + ", quantity=" + quantity + "]";
	}
	
	

}
