package collections;

import java.util.PriorityQueue;

public class Queue {
	
	public static void main (String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(5);
		pq.add(7);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(6);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq); 
		System.out.println(pq.contains(3));
		while(!pq.isEmpty()) 
			System.out.println(pq.poll());
		
		//pq.clear();
		
	}

}
