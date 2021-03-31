package com.gqt.collection.deque;

import java.util.Deque;
import java.util.LinkedList;

public class Prog1_Deque {
public static void main(String[] args) {
	Deque<Integer> dq=new LinkedList<>(); 
	dq.add(10);
	dq.add(11);
	dq.add(9);
	dq.add(5);
	dq.offer(6);
	System.out.println("Deque before operations: " +dq);
	dq.addFirst(5);
	System.out.println("Deque After addFirst(): "+dq);
	dq.addLast(8);
	System.out.println("Deque After addLast(): "+dq);
}
}
