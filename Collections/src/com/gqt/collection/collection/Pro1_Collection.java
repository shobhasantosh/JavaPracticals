package com.gqt.collection.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Pro1_Collection {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>(); // creating Collection object using ArrayList - c = collection
		System.out.println("Size of the Array: " + c.size());
		System.out.println("Empty or Not: " + c.isEmpty());
		System.out.println("Array after adding element: " + c.add(4));
		c.add(5);

		Object[] t = c.toArray(); // Convert Collection Array c into Object array
		System.out.println("Array after Converting Collection Array to Object[]: ");
		for (Object a : t)
			System.out.println((a));

		System.out.println("Does array contains 6: " + c.contains(6));
		System.out.println("Does array contains 5: " + c.contains(5));

		Integer[] ia = new Integer[c.size()]; // create new Integer array with array size.
		Integer[] ib = new Integer[0]; // create new array of size 0

		Integer[] nia = c.toArray(ia); // Converting array c into specified type of nia + if ia fits into nia, just
		// return the elements otherwise new array ia is created of specified type(Integer[]) and then size of collection c.
		System.out.println("Collections Array c converted to nia: " + Arrays.toString(nia));
		System.out.println("array ia : " +Arrays.toString( ia));
		System.out.println("array ib : " + Arrays.toString(ib));
		
		Integer[] nib = c.toArray(ib); // here ib array not created because it fits into nib
		System.out.println("array nib after coverting: "+ Arrays.toString(nib));
				
		Collection<Integer> coll2 = Arrays.asList(10, 5, 6, 7);
		c.addAll(coll2); // passing collection Object as parameter.
		System.out.println("new Collections after addall(): "+ coll2);
		System.out.println("Collections after addall(): "+ c);
		
		Collection<Integer> coll3 = Arrays.asList(11, 12);
		c.addAll(coll3);
		c.remove(12);
		System.out.println("Array after removing element object: " + c);
		
		System.out.println("Collections Array in sorted order:" );		
		// converting collection into stream- used to sort and print		
		 c.stream().sorted((x,y)->(x-y)).forEach(x->System.out.println(x));

		System.out.println("Check containsAll() : "+c.containsAll((coll2)));
		c.add(10);	
		c.add(35);
		c.add(30);
		c.add(45);
		c.removeAll((coll2)); // removes all matching values of coll2 in array c- c.clear, clear other than c
		System.out.println("Array after removing coll2: "+c);

		c.removeIf(x -> x % 2 == 1);
		System.out.println("After removeIf(): "+c);

		Collection<Integer> twocolls = new ArrayList<>(c);
		twocolls.addAll(coll2);
		System.out.println("Size of new collection array: " +twocolls.size());
		System.out.println("new collection array: "+twocolls);
		twocolls.retainAll(c); // remove all just retaining twocolls values
		System.out.println("Array after reating array c " +twocolls);

		System.out.println("Array before clear(): " +coll3);
		//coll3.clear();
	//	System.out.println("Array After clear(): " +c);
		
	}
}
