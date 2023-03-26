package com.prac.com.prac;

public class TNode {
  private int val;
  private TNode left;
  private TNode right;
  
  public TNode(int val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }

	public int getVal() {
		return val;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
	
	public TNode getLeft() {
		return left;
	}
	
	public void setLeft(TNode left) {
		this.left = left;
	}
	
	public TNode getRight() {
		return right;
	}
	
	public void setRight(TNode right) {
		this.right = right;
	}
}
