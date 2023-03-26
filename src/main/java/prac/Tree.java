package prac;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Tree{
  public Node root;
  public Node insertH(Node r,int val){
	if(r == null) {
	 r = new Node(val);	
	 if(root == null)
	  root = r;
	}
	else if(val < r.val) {
	 r.left = insertH(r.left, val);	
	}
	else {
	 r.right = insertH(r.right, val);	
	}
	return r;
  }
  public void insert(int val) {
	insertH(root, val);  
  }
  public void printLevel() {
	Queue<Node> queue = new LinkedList<>();
	queue.add(root);
	
	while(queue.isEmpty() == false) {
	 int size = queue.size();
	 for(int i=0;i<size;i++) {
	   Node node = queue.poll();
	   System.out.print(node.val+" ");
	   
	   if(node.left != null) {
		 queue.add(node.left);  
	   }
	   if(node.right != null) {
		 queue.add(node.right);  
	   }
	 }
	 System.out.println();
	}
  }
}
