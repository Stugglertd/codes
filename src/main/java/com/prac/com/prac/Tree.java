package com.prac.com.prac;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Tree {
  private TNode root;
  public Tree(){
	root = null;  
  }
  public TNode getRoot() {
	return root;  
  }
  TNode insert(TNode tRoot,int val){
    if(tRoot == null) {
     tRoot = new TNode(val);	
    if(root==null)
      root = tRoot;	 
//     return tRoot;
    }
    else if(val < tRoot.getVal()) {//move left	
     tRoot.setLeft(insert(tRoot.getLeft(), val));
//     return tRoot.getLeft();
    }
    else {
     tRoot.setRight(insert(tRoot.getRight(), val));	
//     return tRoot.getRight();
    }
    return tRoot;
  }
  
  void printLevelOrder() {
	Queue<TNode> queue = new LinkedList<>();  
	queue.add(root);
	
	while(queue.isEmpty() == false) {
	 int size = queue.size();
	 for(int i=0;i<size;i++) {
	  TNode tNode = queue.poll();	 
	  System.out.print(tNode.getVal() + " ");
	  
	  if(tNode.getLeft() != null)
		queue.add(tNode.getLeft());
	  if(tNode.getRight() != null)
		queue.add(tNode.getRight());  
	 }
	 System.out.println();
	}
	
  }
  
}
