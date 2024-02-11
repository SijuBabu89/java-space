package com.buddywindow.datastructure.implementation.stack;

import java.util.EmptyStackException;

import com.buddywindow.entity.Person;

public class ArrayStack {

	Person[] stack;
	int top;
	
	public ArrayStack(int capacity) {
		stack = new Person[capacity];
	}
	
	//O(n) -> Since we resize the array
	public void push(Person person) {
		if(top == stack.length) {
			Person[] newStack = new Person[top * 2];
			System.arraycopy(stack, 0, newStack, 0, stack.length);
			stack = newStack;
		}
		stack[top++] = person;
	}
	//O(1)
	public Person pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Person per = stack[--top];
		stack[top] = null;
		return per;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public int size() {
		return top;
	}
	
	//O(1)
	public Person peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	public void print() {
		for(int i=top-1; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}
	
	
}
