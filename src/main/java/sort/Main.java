package sort;

public class Main {

	public static void main(String[] args) { 
	 int[] arr = new int[6];
	 arr[0] = 5; 
	 arr[1] = 2;
	 arr[2] = 76;
	 arr[3] = 4;
	 arr[4] = 1;
	 arr[5] = 8;
	 
	 MergeSort mSort = new MergeSort();
	 QuickSort quickSort = new QuickSort();
	 
	 quickSort.sort(arr, 0, 5);
	 
//	 mSort.sort(0, 5, arr);
	 
	 for(int i=0;i<arr.length;i++)
	  System.out.print(arr[i]+" ");
	}

}
