package com.prac.com.prac;

public class QueueApp {

	public static void main(String[] args) {
	 Queue queue = new Queue();
	 queue.enque(12);
	 queue.enque(8);
	 queue.enque(15);
	 
	 System.out.println(queue.peek());
	 
	 queue.deque();
	 
	 System.out.println(queue.peek());
	}

}
