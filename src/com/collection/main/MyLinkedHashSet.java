package com.collection.main;

import java.util.LinkedHashSet;

public class MyLinkedHashSet {

	/**
	 * Method main to run the java program
	 */
	public static void main(String [] str) {
		
		// Creating LinkedHashSet for storing double numbers
		LinkedHashSet<Double> myLinkedHashSet = new LinkedHashSet<>();
		
		// Adding elements to myLinkedHashSet
		myLinkedHashSet.add(3.0);
		myLinkedHashSet.add(25.2);
		myLinkedHashSet.add(47.001);
		
		// Adding element 47.001 again
		myLinkedHashSet.add(47.001);
		
		// Redirecting myLinkedHashSet to console
		System.out.println(myLinkedHashSet);
		
		// Creating array of doubles
		double arr [] = {2.3, 4.7, 9.003}; 
		
		// Coping array elements to created further LinkedHashSet
		for(int index = 0; index < arr.length; index++) {
			myLinkedHashSet.add(arr[index]);
		}
		
		//Printing to console elements of myLinkedHashSet with new added elements
		System.out.println(myLinkedHashSet);
		
		// Removing element 4.7 and printing to console myLinkedHashSet;
		myLinkedHashSet.remove(4.7);
		System.out.println(myLinkedHashSet);
		
		//Checking that myLinkedHashSet contains element 4.7
		System.out.println("Contains myLinkedHashSet element 4.7: " + myLinkedHashSet.contains(4.7));
		
		//Checking that myLinkedHashSet contains element 9.003
		System.out.println("Contains myLinkedHashSet element 4.7: " + myLinkedHashSet.contains(9.003));
		
		// Checking myLinkedHashSet size
		int size = myLinkedHashSet.size();
		System.out.println("MyLinkedHashSet size = " + size);
		
		//Checking is myLinkedHashSet is empty
		System.out.println("Is myLinkedHashSet empty: " + myLinkedHashSet.isEmpty());
		
		// Removing all elements from the myLinkedHashSet
		myLinkedHashSet.clear();
		
		//Checking is myLinkedHashSet is empty
		System.out.println("Is myLinkedHashSet empty: " + myLinkedHashSet.isEmpty());
		
	}
}
