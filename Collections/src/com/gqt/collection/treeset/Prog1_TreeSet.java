package com.gqt.collection.treeset;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Prog1_TreeSet {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(Arrays.asList("Cat", "Rat", "Bat", "Mat", "Cot","Cot"));
		TreeSet<String> ts1 = new TreeSet<>(Set.of("Cat", "Rat", "Bat", "Mat", "Cot"));  // should not give duplicates
		System.out.println(ts); // [Bat, Cat, Cot, Mat, Rat]
		System.out.println(ts1);
		ts.add("Cat"); //remove duplicates
		ts.add("Apple");
		System.out.println(ts); // [Apple, Bat, Cat, Cot, Mat, Rat]
	}
}
