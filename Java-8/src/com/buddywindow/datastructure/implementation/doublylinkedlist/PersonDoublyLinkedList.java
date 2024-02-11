package com.buddywindow.datastructure.implementation.doublylinkedlist;

import com.buddywindow.entity.Person;

/**
 * 
 * [Siju]<=>[Babu]<=>[Sanu]<=>[Sam]<=>[Mal]
 *    |                                 | 
 *    |                                 |
 *  Head                              Tail 
 *  
 *So in doubly linked list the first element holds the head. And last element hold the tail.
 *So if we want to add an element at first then it is easy of time complexity of O(1)
 *Also if we want to add an element at last then it is easy of time complexity of O(1)
 *Similarly deleting the element at first and last are also easy of time complexity O(1)
 *Because the only thing to do is just add/delete the element at first or last 
 *and point the head and tail to the next or new element
 *
 * 
 *add() add element at the first - O(1)
 *add() add element at the last - O(1)
 *delete() delete element at the first - O(1)
 *delete() delete element at the last - O(1)
 * 
 * @author sijus
 *
 */
public class PersonDoublyLinkedList {

	private PersonNode head;
	private PersonNode tail;
	int size;
	
	public void addFirst(Person person) {
		PersonNode personNode = new PersonNode(person);
		personNode.setNext(head);
		if(head == null) {
			tail = personNode;
		} else {
			head.setPrevious(personNode);
		}
		head = personNode;
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public void addLast(Person person) {
		PersonNode personNode = new PersonNode(person);
		if(tail == null) {
			tail = personNode;
		}else {
			tail.setNext(personNode);
			personNode.setPrevious(tail);
		}
		tail = personNode;
		size++;
	}
	
	public PersonNode deletLast() {
		if(isEmpty()) {
			return null;
		}
		PersonNode taiil = this.tail;
		this.tail = tail.getPrevious();
		this.tail.setNext(null);
		size--;
		return taiil;
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public PersonNode deleteFirst() {
		if(isEmpty()) {
			return null;
		}
		PersonNode first = this.head;
		head = first.getNext();
		first.setPrevious(null);
		size--;
		return first;
	}
	public void print() {
		System.out.print("head <=>");
		PersonNode current = head;
		while(current != null) {
		System.out.print(current.getPerson());
		System.out.print("<=>");
		current = current.getNext();
		}
		System.out.print(" null");
		System.out.println();
	}
}
