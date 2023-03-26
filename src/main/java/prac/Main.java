package prac;

public class Main {

	public static void main(String[] args) {
	 int[] arr = new int[8];
	 arr[1] = 5;
	 arr[2] = 7;
	 arr[3] = 6;
	 arr[4] = 1;
	 arr[5] = 2;
	 arr[6] = 3;
	 arr[7] = 10;
	 
	 Heap heap = new Heap(arr,15);
//	 heap.insert(10);
//	 heap.insert(5);
//	 heap.insert(6);
//	 heap.insert(4);
//	 heap.insert(3);
//	 heap.insert(2);
//	 heap.insert(1);
//	 heap.insert(7);
	 
//	 heap.insert(10);
//	 heap.insert(6);
//	 heap.insert(7);
//	 heap.insert(2);
//	 heap.insert(1);
//	 heap.insert(5);
//	 heap.insert(3);
	 
	
	 
	 heap.print();
	 heap.insert(8);
	 
	 heap.print();
	 
	 heap.delete();
	 
	 heap.print();
	}

}
