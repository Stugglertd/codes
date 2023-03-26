package sort;

public class QuickSort {
  int partition(int[] arr,int s,int e){
	int pvt = arr[s];
	int cnt = 0;
	for(int i=s+1;i<=e;i++) { 
	 if(arr[i] < pvt) {
		cnt += 1;
	 }
	}
	int pvtInd = s + cnt;
	int temp = arr[pvtInd]; 
	arr[pvtInd] = arr[s];
	arr[s] = temp;
	
	int i=s,j=e;
	
	while(i<pvtInd && j>pvtInd) {
	 while(i<pvtInd && arr[i]<pvt)
		 i+=1;
	 while(j>pvtInd && arr[j]>pvt)
		 j-=1;
	 if(i<pvtInd && j>pvtInd) {
	  temp = arr[i];
	  arr[i] = arr[j];
	  arr[j] = temp;
	 }
	 i+=1;j-=1;
	}
	return pvtInd;
  }
  void sort(int[] arr,int s,int e){
	if(s < e) {
	  int p = partition(arr,s,e);
	  
	  sort(arr, s, p-1);
	  sort(arr, p+1, e);
	}
  }
}
