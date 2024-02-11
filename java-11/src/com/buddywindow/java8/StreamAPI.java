package com.buddywindow.java8;

import java.util.ArrayList;
import java.util.stream.Stream;

//Stream API
/**
 * 
 * @author sijus
 * Java Stream API
 * Stream api is used to process collection. 
 * Stream API gives elements in streams. This will not impact the main collection. So if we want to work with any collection
 * we can make use of stream api which gives all elements in stream. 
 * Once you consume the stream you can't reuse it -> Refer line number 53-> This will throw error
 * Refer Stream document. When we call patientList.Stream() -> It returns a Stream element
 * Refer Stream class for its methods and usage
 * In Java we can process the below classes using Stream API
 * 1) Arrays
 * 	String[] array = {"a", "b", "c"};
	Stream<String> stream = Arrays.stream(array);
	// or
	Stream<String> stream2 = Stream.of(array);
---------------------------------------------------------------------	
 * 2) Can be used with Sets and Lists
 * 	Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
	Stream<Integer> setStream = set.stream();

	List<String> list = Arrays.asList("apple", "banana", "orange");
	Stream<String> listStream = list.stream();	
---------------------------------------------------------------------	
	3) Can be used with Streams from other sources
	// Stream of file lines
	Stream<String> fileLines = Files.lines(Paths.get("file.txt"));

	// Stream of random numbers
	Stream<Integer> randomNumbers = Stream.generate(() -> new Random().nextInt(100));
	---------------------------------------------------------------------------------
 */
public class StreamAPI {

	//Consumer -> takes a type as argument and returns nothing
	//Predicate -> Takes and argument and do the filtering/matching and return boolean
	//Function -> Takes a type as argument and return another or same type.
	//BiConsumer -> takes two type as argument and returns nothing
	//BiPredicate -> Takes two types as argument and do the filtering/matching and return boolean
	//BiFunction -> Takes two type as argument and return another or same type.
	public static void main(String ar[]) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Hi");
		strings.add("Hello");
		strings.add("How Are You");
		Stream<String> stringStream = strings.stream();
		stringStream.map(ss -> ss.concat("Siju"));
		stringStream.forEach(ele -> System.out.println(ele));//ERROR
	}
}
