package com.prac.com.prac;

public class Stack{
  private Node top;
  private Node head;
  public Stack(){
	head = null;  
  }
  void push(int val){
	if(head == null) {
     head = new Node(val);	
     top = head;
	}
	else {
	 Node temp = new Node(val);
	 temp.next = head;
	 head = temp;
	 top = head;
	}
  }
  void pop() {
	if(top == null) {
	  System.out.println("Nothing to pop");	
	}
	else {
	  head = head.next;
	  top = head;
	}
  }
  int getTop() {
	return top.data;  
  }
}
