package com.gqt.collection.list;

import java.util.HashSet;
import java.util.List;

public class Prog3_List {
	public static void main(String[] args) {
		List<Integer> l1 = List.of(5, 6, 2, 9);
		List<Integer> l2 = List.of(5, 6, 21, 91);

		HashSet<List<Integer>> hs = new HashSet<>(); // can pass List as Tag type
		hs.add(l1);
		hs.add(l2); // inturn call hashcode() and equals() to remove duplicates
		System.out.println(hs);

	}
}
