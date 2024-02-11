package com.buddywindow.datastructure;

import java.util.List;
import java.util.Vector;

import com.buddywindow.datastructure.implementation.singlylinkedlist.PersonSinglyLinkedList;
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
public class SinglyLinkedList {

	public static void main(String[] args) {
		PersonSinglyLinkedList persons = new PersonSinglyLinkedList();
		System.out.println(persons.isEmpty());
		persons.addFirst(new Person("Siju", "Babu", "TVM", 100));
		persons.addFirst(new Person("Ram", "Man", "KLM", 101));
		persons.addFirst(new Person("Joe", "Jef", "MLA", 102));
		persons.addFirst(new Person("Marta", "Keff", "NYC", 103));
		persons.addFirst(new Person("Jack", "Meffer", "CHC", 104));
		persons.addFirst(new Person("Rolly", "Juff", "DALL", 107));
		persons.print();
		System.out.println(persons.isEmpty());
		System.out.println(persons.size());
		persons.deleteFirst();
		persons.print();
		System.out.println(persons.size());

	}

}
