package com.gqt.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Prog1_Set {
public static void main(String[] args) {
	// Set is Interface and HashSet i Class, so we use classes to create object and change the parent to Set
	Set<String> as=new HashSet<>(Arrays.asList("Cat","Rat","Bat","Mat","Cot"));
	System.out.println(as); // the order is descending order by default  [Mat, Rat, Bat, Cat, Cot]
	System.out.println("Size of Set: "+as.size());
	as.add("Cat"); // Doesnot allow duplicates
	as.add("Mat");
	as.add("Ball");
	System.out.println(as); //[Ball, Mat, Rat, Bat, Cat, Cot]
}
}