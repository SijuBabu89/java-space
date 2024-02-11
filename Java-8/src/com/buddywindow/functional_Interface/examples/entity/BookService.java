package com.buddywindow.functional_Interface.examples.entity;

import java.util.List;

public class BookService {

	public List<Book> getBooks() {
		BookDAO bookDAO = new BookDAO();
		return bookDAO.getAllBooks();
	}
}
