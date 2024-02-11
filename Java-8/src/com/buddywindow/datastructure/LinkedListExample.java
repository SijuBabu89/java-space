package com.buddywindow.datastructure;

import java.util.Iterator;
import java.util.LinkedList;

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
public class LinkedListExample {

	public static void main(String ar[]) {
		LinkedList<Person> persons = new LinkedList<>(); 		
		persons.add(new Person("Siju", "Babu", "TVM", 100));
		persons.add(new Person("Ram", "Man", "KLM", 101));
		persons.add(new Person("Joe", "Jef", "MLA", 102));
		persons.add(new Person("Marta", "Keff", "NYC", 103));
		persons.add(new Person("Jack", "Meffer", "CHC", 104));
		persons.add(new Person("Rolly", "Juff", "DALL", 107));
		print(persons);		
		persons.add(new Person("Kiran", "Ram", "TVM", 500));
		print(persons);
		persons.addFirst(new Person("First", "Farsan", "France", 333));
		print(persons);
//		System.out.println("Foreach Output");
//		persons.forEach(per -> System.out.println(per));
//		
//		System.out.println("For loop");
//		
//		for(Person per: persons) {
//			System.out.println(per);
//		}
	}
	
	public static void print(LinkedList<Person> persons) {
		System.out.println("Iterator Output");
		Iterator<Person> iterator = persons.iterator();
		System.out.print("head <=> ");
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(" <=> ");
		}
		System.out.print("null");
	}
}
