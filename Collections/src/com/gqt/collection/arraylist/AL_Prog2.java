package com.gqt.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AL_Prog2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(25, 35, 42, 12));
		Collections.synchronizedList(al); // Returns a synchronized (thread-safe) list backed by the specified list.
		System.out.println("ArrayList after Synchronized:" + al); // [25, 35, 42, 12]

		Collections.sort(al);
//	System.out.println("AL before explicitly sorting in ascending order: "+al); /[12, 25, 35, 42]
		al.sort((x, y) -> y - x);
		System.out.println("AL after explicitly sorting in descending: " + al); // [42, 35, 25, 12]

		Collections.sort(al, ((x, y) -> y - x));
		System.out.println("AL after sorting diectly in descending order : " + al); // [42, 35, 25, 12]
	}
}
