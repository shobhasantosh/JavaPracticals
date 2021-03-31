package com.gqt.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Prog1_List {
 public static void main(String[] args) {
	List<Integer> i=new ArrayList<>();
	i.add(10);
	i.add(1,2); // add value (index,value)
	i.add(2,5);
	i.add(3,3);
	i.add(15);
	i.add(16);
	System.out.println("Initial List: "  + i); //[10, 2, 5, 3]
	
	i.remove(1); // pass position- remove element at 1st position of list
	i.remove((Object)5); // pass element itself- remove element 5.
	System.out.println("List after removing elements" + i); 

	for(int a=0;a<i.size();a++) {
		System.out.println("Getting the List elements:" + i.get(a));
	}
	
	System.out.println("List printed using enhanced for loop: ");
	for(Integer ef:i) {
		System.out.println(ef); // using enhanced for loop
	}
	
	i.sort((x,y)->(x-y)); //return type is void
	System.out.println("After sorting"+ i);
	i.add(15);
	i.add(20);
	
	List<Integer> nl=List.copyOf(i); // pass argument of type collection
	System.out.println("List nl after copyOf(i): " +nl);	
	System.out.print("List i after copyOf(i):"+i);
	
	ListIterator<Integer> lite=i.listIterator(2); // start cursor from starting position or specified positio2
	while(lite.hasNext()) {
		System.out.print(lite.next());
	}
	
	System.out.println("");
	
	while(lite.hasPrevious()) { // cursor from last postion - backwards
		System.out.print(lite.previous());
	}
	
	lite.add(100); // can add values into ListIterator
	for(;lite.hasNext();) {
		System.out.print(lite.next());
	}

}
}
