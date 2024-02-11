package com.buddywindow.datastructure;

import com.buddywindow.datastructure.implementation.doublylinkedlist.PersonDoublyLinkedList;
import com.buddywindow.entity.Person;

public class DoublyLinkedListExample {

	public static void main(String[] args) {
		PersonDoublyLinkedList persons = new PersonDoublyLinkedList();
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
		persons.addLast(new Person("Siju1", "Babu1", "TVM", 100));
		persons.print();
		persons.deletLast();
		persons.print();
		persons.addLast(new Person("Siju11", "Babu11", "TVM", 100));
		persons.print();
		persons.deleteFirst();
		persons.print();
		

	}
}
