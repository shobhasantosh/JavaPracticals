package com.gqt.collection.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Prog2_comparator {
 public static void main(String[] args) {
	 SortedSet<String> ss1=new TreeSet<>((x,y)->y.compareTo(x));
	 ss1.add("Hello");
	 ss1.add("java");
	 ss1.add("Cat");
	 ss1.add("car");
	 System.out.println(ss1);
	 
	 // Alternative using comparator()
	 SortedSet<String> ss2=new TreeSet<>(ss1.comparator());
	 ss2.add("Hello");
	 ss2.add("java");
	 ss2.add("Cat");
	 ss2.add("car");
	 System.out.println(ss2);
	 
	
}
}
