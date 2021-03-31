package com.gqt.collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Prog1 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		System.out.println("Poll: " + q.poll());
		q.add(10);
		q.offer(20);
		System.out.println("Queue :" + q);
		q.poll();
		System.out.println("Queue after poll(): " + q);
		q.add(25);
		q.add(35);
		q.add(45);
		System.out.println("Queue before remove(): " + q); // [20, 25, 35, 45]
		q.remove(); // remove 20
		System.out.println("Queue after remove(): " + q); // [25, 35, 45]
		System.out.println("element(): " + q.element()); //25
		System.out.println("Queue after element(): " + q);// [25, 35, 45]
		System.out.println("Peek(): " +q.peek()); //25
		System.out.println("Queue after peek(): " + q); // [25, 35, 45]
	}
}
