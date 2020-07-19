package com.epam.java8_lambdas_and_streams;

import java.util.*;
import java.util.function.Predicate;

public class PalindromeDemo {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("malayalam");
		list.add("tomato");
		list.add("madam");
		list.add("palindrome");
		list.add("radar");
		list.add("hello");
		list.add("level");
		
		List<String> palindromes = PalindromeDemo.filterList(list, Palindrome::isPalindrome);
		
		System.out.println(palindromes);
	}
	
	public static List<String> filterList(List<String> list, Predicate<String> predicate){
		List<String> finalList = new ArrayList<>();
		
		for(String s: list) {
			if(predicate.test(s)) {
				finalList.add(s);
			}
		}
		return finalList;
	}
}
