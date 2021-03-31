package com.gqt.collection.iterable;

import java.util.ArrayList;
import java.util.Iterator;

//requirement: print the array values using iterator();
//Iterators allow the caller to remove elements from the underlying collection during the iteration with well-defined semantics.
public class Prog1_Iterable {

	public static void main(String[] args) {
		ArrayList<Integer> allv = new ArrayList<>();
		allv.add(5); // add() executed from j.u.Collection not ArrayList class
		allv.add(6);
		allv.add(7);
		allv.add(8);
		allv.add(5);
		allv.forEach((x)->System.out.println(x));
		Iterable<Integer> i = allv;
		
		Iterator<Integer> ite = i.iterator(); // convert List to iterator-cursor point to 1st pos - the cursor cant move back once moved.
		for (; ite.hasNext();) { // returns true if iterator is having value in next position, else false.
			int v = ite.next(); // it helps to move the position of the cursor to next value
			System.out.println(v);
		}
	
		
	}

}
