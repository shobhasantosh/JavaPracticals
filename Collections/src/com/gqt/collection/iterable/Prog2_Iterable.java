package com.gqt.collection.iterable;

import java.util.ArrayList;
import java.util.Iterator;

// Program to remove the 1st  primenumber in the list and come out.

public class Prog2_Iterable {
	public static void main(String[] args) {
		ArrayList<Integer> allv = new ArrayList<>();
		allv.add(18); // add() executed from j.u.Collection not ArrayList class
		allv.add(16);
		allv.add(7);
		allv.add(8);
		allv.add(5);
		allv.add(8);

		Iterable<Integer> i = allv;
		Iterator<Integer> ite = i.iterator(); // convert List to iterator -importantant
		for (; ite.hasNext();) {
			int v = ite.next();
		
			int fact=0;
			for(int a=1;a<v/2 +1;a++) {
				if(v%a==0 && fact++>1)break;
			}
			if(fact==1) {
				ite.remove(); // remove the value in the current position
				break;
			}
		}
		
		ite.forEachRemaining(x->System.out.println(x)); // print left over array elements after removing 1st prime number
	}
	
}
