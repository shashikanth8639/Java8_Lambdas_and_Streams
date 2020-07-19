package com.epam.java8_lambdas_and_streams;

import java.util.*;
import java.util.stream.Collectors;

public class StartingWithAand3Chars {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A45l");
		list.add("lockdown");
		list.add("hello");
		list.add("ant");
		list.add("Virtual");
		list.add("AntiVirus");
		list.add("AVP");
		list.add("a12");
		
		System.out.println("List before Validation");
		System.out.println(list);
		System.out.println("List after Validation");
		System.out.println(validate(list));

	}
	
	public static List<String> validate(List<String> list){
		return list.stream().
				filter(s -> s.startsWith("a") && s.length()==3)
				.collect(Collectors.toList());
	}
}
