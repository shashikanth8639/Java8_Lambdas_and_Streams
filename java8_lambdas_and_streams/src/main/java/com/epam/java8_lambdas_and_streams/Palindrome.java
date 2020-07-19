package com.epam.java8_lambdas_and_streams;

public class Palindrome {
	public static boolean isPalindrome(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		if(s.equals(sb.toString()))
			return true;
		return false;
	}
}
