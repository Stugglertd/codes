package com.prac.com.prac;

public class HeapApp{	
 public static void main( String[] args ){
//   Heap heap = new Heap(50);
//   heap.insert(50);
//   heap.insert(55);
//   heap.insert(53);
//   heap.insert(52);
////   heap.insert(10);
//   heap.insert(54);
//   
//   heap.print();
//   
//   heap.delete();
//   
//   heap.print();
	 
	 int[] arr = {-1,54,53,55,52,50};
	 Heap heap = new Heap(arr, 50);
	 
	 for(int i=arr.length;i>0;i--) {
	   heap.Heapify(i);	 
	 }
	 
	 heap.print();
 }
}


















