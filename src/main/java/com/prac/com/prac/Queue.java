package com.prac.com.prac;

public class Queue {
  private Node front;
  private Node tail;
  public Queue(){
	front=null;
	tail=null;
  }
  
  void enque(int val){
	if(front == null) {
	  front = new Node(val);	
	}
	else {
	  Node tempNode = new Node(val);	
	  tempNode.next = front;
	  front = tempNode;
	}
  }
  int peek() {
	return front.data;  
  }
  void deque(){
	if(front == null) {
	 System.out.println("Empty queue");
	 return;
	}
	front = front.next;
	
	if(front == null)
	  tail = null;	
  }
}
