package com.buddywindow.datastructure.implementation.singlylinkedlist;

import com.buddywindow.entity.Person;

/**
 * 
 * [Siju|Addr of next]->[Babu|Addr of Next]->[Sanu|Addr of next]->[Sam|Addr of next]->[Mal|Addr of next]
 *    |
 *    |
 *  Head
 *  
 *So in singly linked list the first element holds the head. So if we want to add an element at list then it is easy of time complexity of O(1)
 *Because the only thing to do is just add that element at first and point it as head
 *
 *Similarly to delete an element at first is also easy just change the head position to second.
 * 
 *add() add element at the first - O(1)
 *delete() delete element at the last - O(1)
 * 
 * @author sijus
 *
 */
public class PersonSinglyLinkedList {

	private PersonNode head;
	int size;
	
	public void addFirst(Person person) {
		PersonNode personNode = new PersonNode(person);
		personNode.setNext(head);
		head = personNode;
		size++;
	}
	
	public int size() {
		return size;
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
		size--;
		return first;
	}
	public void print() {
		System.out.print("head ->");
		PersonNode current = head;
		while(current != null) {
		System.out.print(current.getPerson());
		System.out.print("->");
		current = current.getNext();
		}
		System.out.print(" null");
		System.out.println();
	}
}
