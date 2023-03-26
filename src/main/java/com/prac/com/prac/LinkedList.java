package com.prac.com.prac;

public class LinkedList {
  Node head;
  void insert(int val) {
	if(head == null) {
	 head = new Node(val);	
	}
	else{
	 Node temp = head;	
//	 head = new Node(val);
//	 head.next = temp;
	 while(temp.next != null) {
		temp = temp.next; 
	 }
	 temp.next = new Node(val);
	}
  }
  void reverse() {
	Node temp=head,nxt=null,prev=null;
	while(temp != null) {
	 nxt = temp.next;
	 temp.next = prev;
	 prev = temp;
	 temp = nxt;
	}
	head = prev;
  }
  void print() {
	Node temp = head;
	while(temp != null) {
	 System.out.print(temp.data+" ");
	 temp = temp.next;
	}
	System.out.println();
  }
}
