package com.buddywindow.datastructure;

import java.util.ArrayList;
import java.util.List;

import com.buddywindow.entity.Person;

/**
 * 
 * @author sijus
 * 
 * Capacity -> Total capacity of the ArrayList
 * Size -> total elements size stored in the ArrayList
 * 
 * ArrayList is good if you have the Index 
 * 
 * add() : Adding element usually take O(1) time complexity but may take O(n) if the capacity exceeds
 * add(1, Object) : O(n) Since it needs to shift elements in worst case
 * get(index) : O(1)
 * remove(index)|remove(object) : O(n) since it needs to shift the elements
 * indexOf(object) : O(n) since it needs to traverse the array
 * contains(object) : O(n)  since it needs to traverse the array
 * 
 *
 */
public class ArrayListExample {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Siju", "Babu", "TVM", 100));
		persons.add(new Person("Ram", "Man", "KLM", 101));
		persons.add(new Person("Joe", "Jef", "MLA", 102));
		persons.add(new Person("Marta", "Keff", "NYC", 103));
		persons.add(new Person("Jack", "Meffer", "CHC", 104));
		persons.add(new Person("Rolly", "Juff", "DALL", 107));
		
		persons.forEach(per -> System.out.println(per));
		
		persons.add(new Person("Sam", "Joes", "MARF", 200)); //O(1)/O(n) -> It adds the element at the last index. If the size is exceeded then the array will be resized and add the element
		persons.add(2, new Person("Jeff", "Maff", "SAHARA", 3000)); // -> O(n)
		persons.get(2);//O(1)
		persons.indexOf(new Person(null, null, null, 0));//O(n)
		persons.contains(new Person(null, null, null, 0));//O(n)
		persons.remove(2);//O(n)
		
		//This will give you the person object in Object Type
		Object[] personObjectArray = persons.toArray();
		//Here we are converting to Person Type by casting
		Person[] personArray = persons.toArray(new Person[persons.size()]);

	}

}
