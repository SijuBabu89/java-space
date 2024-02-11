package com.buddywindow.datastructure.implementation.stack;

import java.util.Iterator;
import java.util.LinkedList;

import com.buddywindow.entity.Person;

public class LinkedStack {

	private LinkedList<Person> stack;
	
	public LinkedStack() {
		stack = new LinkedList<Person>();
	}
	
	public void push(Person person) {
		stack.push(person);
	}
	
	public void pop() {
		stack.pop();
	}
	
	public Person peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int size() {
		return stack.size();
	}
	
	public void print() {
		Iterator<Person> personIterator = stack.iterator();
		while(personIterator.hasNext()) {
			System.out.println(personIterator.next());
		}
	}
	
}
