package com.buddywindow.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String ar[]) {
		List<String> strings = Arrays.asList("Siju", "Babu", "Sanu", "SS");
		strings.stream().filter(str -> str.contains("s")).collect(Collectors.toList());
	}
}
