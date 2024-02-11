package com.buddywindow.functional_Interface.examples.entity;

import java.util.Arrays;
import java.util.List;

public class BookDAO {

	List<Book> books = Arrays.asList(new Book(1, "One Night","Samual SR", 433,120.40),
			new Book(1, "One Night","Samual SR", 433,120.40),
			new Book(1, "One Night","Samual SR", 433,120.40),
			new Book(1, "One Night","Samual SR", 433,120.40),
			new Book(1, "One Night","Samual SR", 433,120.40),
			new Book(1, "One Night","Samual SR", 433,120.40),
			new Book(1, "One Night","Samual SR", 433,120.40),
			new Book(1, "One Night","Samual SR", 433,120.40),
			new Book(1, "One Night","Samual SR", 433,120.40),
			new Book(1, "One Night","Samual SR", 433,120.40));
	
	public List<Book> getAllBooks() {
		return books;
	}
}
