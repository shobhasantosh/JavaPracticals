package com.gqt.collection.sortedset;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Prog1_sortedset {
public static void main(String[] args) {
	SortedSet<String> ss=new TreeSet<>(Arrays.asList("Cat","mat","Bat","cot","dog","Log")); // here values will be sorted -ascending order
	System.out.println(ss); //[Bat, Cat, Log, cot, dog, mat]
	System.out.println(ss.subSet("Cat","mat")); //[Cat, Log, cot, dog] -input should be based on sorted Set.
	System.out.println(ss.subSet("Cat","nogg"));//[Cat, Log, cot, dog]
	System.out.println(ss.headSet("dog")); //[Bat, Cat, Log, cot]
	System.out.println(ss.tailSet("Log")); //[Log, cot, dog, mat]
	System.out.println(ss.first()); //Bat
	System.out.println(ss.last()); //mat
}
}
