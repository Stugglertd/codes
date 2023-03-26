package com.prac.com.prac;

public class StackApp {
  public static void main(String[] args) {
	Stack stack = new Stack();
	stack.push(4);
	stack.push(1);
	
	System.out.println(stack.getTop());
	
	stack.push(6);
	stack.push(12);
	
	System.out.println(stack.getTop());
	
	stack.pop();
	
	System.out.println(stack.getTop());
  }
}
