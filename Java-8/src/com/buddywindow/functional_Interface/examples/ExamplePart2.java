package com.buddywindow.functional_Interface.examples;

import java.util.Comparator;

import com.buddywindow.functional_Interface.examples.entity.Book;

public class ExamplePart2 {

}


class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {		
		return o1.getName().compareTo(o2.getName());
	}
	
}