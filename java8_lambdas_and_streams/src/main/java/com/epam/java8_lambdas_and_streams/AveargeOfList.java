package com.epam.java8_lambdas_and_streams;

import java.util.*;

public class AveargeOfList {
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		al.add(45);
		al.add(132);
		al.add(86);
		al.add(16);
		al.add(94);
		al.add(61);
		al.add(59);
		al.add(76);
		
		float avg = getAverage(al);
		System.out.println("The average of given list is: "+avg);
		
	}
	
	public static float getAverage(List<Integer> list) {
		
		int sum = list.stream().mapToInt(Integer:: intValue).sum();
		return (float)sum/list.size();
	}
}	
