package sort;

public class MergeSort {
 
  void merge(int s,int mid,int e,int[] arr){
	
	int len1 = mid-s+1;
	int len2 = e-mid;
	
	int[] left = new int[len1];
	int[] right = new int[len2]; 
	
	int ind=0;
	for(int i=s;i<=mid;i++)
	 left[ind++] = arr[i];
	ind = 0;
	for(int i=mid+1;i<=e;i++)
	 right[ind++] = arr[i];
	
	int i=0,j=0;
	ind = s;
	while(i<len1 && j<len2) {
	 if(left[i] < right[j]) {
	  arr[ind] = left[i];
	  ind+=1;
	  i+=1;
	 }
	 else {
	  arr[ind] = right[j];
	  j+=1;
	  ind += 1;
	 }
	}
	while(i<len1) {
	 arr[ind] = left[i];
	 ind+=1;
	 i+=1;	
	}
	while(j<len2) {
	 arr[ind] = right[j];
	 ind += 1;
	 j+=1;
	}
  }
  void sort(int s,int e,int[] arr){
	if(s < e){  
		int mid = (s+e)/2;  
		sort(s,mid,arr);
		sort(mid+1,e,arr);
		merge(s,mid,e,arr);
	}
  }
}
