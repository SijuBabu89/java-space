package com.buddywindow.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.buddywindow.entity.Person;

/**
 * Vector is also having the same implementation that the ArrayList have
 * The Only difference is Vector is Thread safe. So it is synchronized and ArrayList 
 * is not synchronized. Synchronization can make the process slow
 * So if you not required then do not use Vector instead use ArrayList
 * 
 * To see the difference in synchronization implementation and 
 * non synchronization implementation refer add method of vector and arraylist
 * @author sijus
 *
 */
public class VectorExample {

	public static void main(String ar[]) {
		List<Person> persons = new Vector<>();
		Person pp = new Person(null, null, null, 0);
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
