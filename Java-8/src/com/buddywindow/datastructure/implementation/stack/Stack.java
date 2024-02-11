package com.buddywindow.datastructure.implementation.stack;

import com.buddywindow.entity.Person;

/**
 * 
 * @author sijus
 *
 *Stack is FILO -> First in Last OUT
 *For example is consider we have a bundle on paper in a rack and just consider we add 
 *new set of paper on top of the alreday existing paper and if you want to take a paper you
 *will take from the top of the paper bundle which is the one you added on top
 *
 *Another good example is recursive method call. Here the last method call will execute first
 *
 *push - adds an item as the top item on the stack
 *pop - removes the top item on the stack
 *peek - gets the top item on the stack without popping
 *
 *
 *LikedList would be the best backing datastructure for stack because stack operation is fully based on the
 *first element and we know that managing first element in linked list is O(1)
 *
 *But if you use arraylist as backing datastructure for deleting and adding the element at the first we need to re arrange the
 *below element so time complexity would be O(n)
 */
public class Stack {

	public static void main(String ar[]) {
		
		Person p1 = new Person("Siju", "Babu", "TVM", 100);
		Person p2 = new Person("Ram", "Man", "KLM", 101);
		Person p3 = new Person("Joe", "Jef", "MLA", 102);
		Person p4 = new Person("Marta", "Keff", "NYC", 103);
		Person p5 = new Person("Jack", "Meffer", "CHC", 104);
		Person p6 = new Person("Rolly", "Juff", "DALL", 107);
		
//		ArrayStack arrayStack = new ArrayStack(10);
//		arrayStack.push(p1);
//		arrayStack.push(p2);
//		arrayStack.push(p3);
//		arrayStack.push(p4);
//		arrayStack.push(p5);
//		arrayStack.push(p6);
//		arrayStack.print();
////		System.out.println(arrayStack.peek());
//		System.out.println(arrayStack.pop());
//		System.out.println("______________-");
//		arrayStack.print();
		
		LinkedStack linkedStack = new LinkedStack();
		linkedStack.push(p1);
		linkedStack.push(p2);
		linkedStack.push(p3);
		linkedStack.push(p4);
		linkedStack.push(p5);
		linkedStack.push(p6);
		linkedStack.print();
		
	}
}
