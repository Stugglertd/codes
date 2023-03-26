package com.prac.com.prac;

public class Heap {
  private int size;
  private int[] Heap;
  
  public Heap(int mxSize){
	this.size = 0;
	this.Heap = new int[mxSize];
  }
  public Heap(int[] arr,int mxSize) {
	this(mxSize);
	this.size = arr.length-1; 
	
	for(int i=1;i<=size;i++) {
     Heap[i] = arr[i];		
	}
  }
  
  void insert(int val){
	size += 1;
	int ind = size;
	Heap[ind] = val;
	
	while(ind > 1) {
	  int par = ind/2;	
	  if(Heap[par] < Heap[ind]) {
		int temp = Heap[par];
		Heap[par] = Heap[ind];
		Heap[ind] = temp;
		
		ind = par;
	  }
	  else {
		 return; 
	  }
	}
	
  }
  public void delete(){//code by anuj b
		int removedVal = Heap[1];  
		Heap[1] = Heap[size];
		size -= 1;
		
		int ind = 1;
		
		while(ind < size){
		 int left = ind*2;
		 int right = ind*2+1;
		 int larger = (Heap[left] > Heap[right])?left:right;
		 
		 //swap larger and ind
		 int temp = Heap[ind];
		 Heap[ind] = Heap[larger];
		 Heap[larger] = temp;
		 
		 ind = larger;
		}
		
  }
//  void delete() {//wrong code by love
//	if(size == 0) {
//	  System.out.println("Nothing to delete");
//	  return;
//  	}
//	//Step 1 : Put last element into first element
//	Heap[1] = Heap[size];
//	//Step 2 : remove last element
//	size -= 1;
//	
//	//Step 3 : take root node to it's correct position
//	int ind=1;
//	while(ind < size) {
//	  int leftInd = 2*ind;
//	  int rightInd = 2*ind + 1;
//	  
//	  if(leftInd < size && Heap[ind] < Heap[leftInd]) {
//		int temp = Heap[ind];
//		Heap[ind] = Heap[leftInd];
//		Heap[leftInd] = temp;
//		
//		ind = leftInd;
//	  }
//	  else if(rightInd < size && Heap[ind] < Heap[rightInd]) {
//		int temp = Heap[ind];
//		Heap[ind] = Heap[rightInd];
//		Heap[rightInd] = temp;
//			
//		ind = rightInd;  
//	  }
//	  else {
//		return;  
//	  }
//	}
//  }
  
  void print() {
	for(int i=1;i<=size;i++) {
	 System.out.print(Heap[i] + " ");	
	}
	System.out.println();
  }
  
  void Heapify(int ind) {
	int leftChild = 2*ind;
	int rightChild = 2*ind+1;
	int largest = ind;
	
	if(leftChild<size && Heap[leftChild]>Heap[largest]) {
	  largest = leftChild;
	}
	if(rightChild<size && Heap[rightChild]>Heap[largest]) {
	  largest = rightChild; 	
	}
	
	if(largest != ind) {
	  int temp = Heap[largest];
	  Heap[largest] = Heap[ind];
	  Heap[ind] = temp;
	  
	  Heapify(largest);
	}
  }
}
