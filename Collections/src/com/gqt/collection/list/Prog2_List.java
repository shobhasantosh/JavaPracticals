package com.gqt.collection.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// Check two collections Lists are same or not

public class Prog2_List {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(5, 6, 2, 9,6); // if we use asList we cant remove or add -size is constant but can can update
		List<Integer> l2 = Arrays.asList(5, 6, 2, 9,6);

		HashSet<List<Integer>> hs = new HashSet<>(); // can pass List as Tag type
		hs.add(l1);
		hs.add(l2); // inturn call hashcode() and equals() to remove duplicates
		System.out.println("HashSet List: "+hs);
		
		System.out.println("index of: " +l1.indexOf(6));
		//l1.add(6); -exception cant add new values
		System.out.println("Last index of: "+l1.lastIndexOf(6));
	}

}
