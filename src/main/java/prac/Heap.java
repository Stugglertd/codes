package prac;

public class Heap{//MaxHeap
  int[] heap;	
  int size;
  public Heap(int maxSize){
	heap = new int[maxSize];
	size = 0;
  }
  public Heap(int[] arr,int mxSize) {
		this(mxSize);
		this.size = arr.length-1; 
		
		for(int i=1;i<=size;i++) {
	     heap[i] = arr[i];		
		}
		convertToheap();
  }
  public void insert(int val){
   size+=1;
   heap[size] = val;
   int ind = size;
   
   while(ind > 1){
	 int par = ind/2;
	 if(heap[par] < heap[ind]) {
	  int temp = heap[par];
	  heap[par] = heap[ind];
	  heap[ind] = temp;
	  
	  ind = ind/2;
	 }
	 else {
	  break;	 
	 }
   }
   
  }
  public void delete(){
	int removedVal = heap[1];  
	heap[1] = heap[size];
	size -= 1;
	
	int ind = 1;
	
	while(ind <= size){
	 int left = ind*2;
	 int right = ind*2+1;
	 int larger = (heap[left] > heap[right])?left:right;
	 
	 //swap larger and ind
	 int temp = heap[ind];
	 heap[ind] = heap[larger];
	 heap[larger] = temp;
	 
	 ind = larger;
	}
	
  }
//   void delete() {
//		if(size == 0) {
//		  System.out.println("Nothing to delete");
//		  return;
//	  	}
//		//Step 1 : Put last element into first element
//		heap[1] = heap[size];
//		//Step 2 : remove last element
//		size -= 1;
//		
//		//Step 3 : take root node to it's correct position
//		int ind=1;
//		while(ind < size) {
//		  int leftInd = 2*ind;
//		  int rightInd = 2*ind + 1;
//		  
//		  if(leftInd < size && heap[ind] < heap[leftInd]) {
//			int temp = heap[ind];
//			heap[ind] = heap[leftInd];
//			heap[leftInd] = temp;
//			
//			ind = leftInd;
//		  }
//		  else if(rightInd < size && heap[ind] < heap[rightInd]) {
//			int temp = heap[ind];
//			heap[ind] = heap[rightInd];
//			heap[rightInd] = temp;
//				
//			ind = rightInd;  
//		  }
//		  else {
//			return;  
//		  }
//		}
//  }
  void Heapify(int ind) {
	
	 int left = ind*2;
	 int right = ind*2 + 1;
	 int largest=ind;
	 
	 if(left<=size && heap[left]>heap[largest]) {
	   largest = left;	 
	 }
	 if(right<=size && heap[right]>heap[largest]) {
	   largest = right;	 
	 }
	 
	 if(ind != largest) {
		 int temp = heap[largest];
		 heap[largest] = heap[ind];
		 heap[ind] = temp;
		 
		 Heapify(largest);
	 }

  }
  void convertToheap(){
   for(int i=size/2;i>=1;i--) {
	 Heapify(i);  
   }
  }
  void print() {
		for(int i=1;i<=size;i++) {
		 System.out.print(heap[i] + " ");	
		}
		System.out.println();
  }
}
