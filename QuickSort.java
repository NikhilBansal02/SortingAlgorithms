package sorting;

public class QuickSort {
	
	public static void quickSort(int a[], int start, int end) {
		
		if(start < end) {
			int pIndex = partition(a,start,end);
			quickSort(a,start,pIndex-1);
			quickSort(a,pIndex+1,end);
		}
	}
	
	public static int partition(int a[], int start, int end) {
		
		int pivot  = a[end];
		int pIndex = start;
		int temp = 0;
		
		for(int i = start; i<end;i++) {
			
			if(a[i] <= pivot) {
				temp = a[i];
				a[i] = a[pIndex];
				a[pIndex] = temp;
				pIndex++;
			}
		}
			 temp = a[pIndex];
		a[pIndex] = a[end];
		   a[end] = temp;
		
		return pIndex;
	}
}

//Best Case Complexity:- O(nlogn) -> when balanced partitioning is happening.
//Worst Case Complexity:- O(n^2) -> When array is already sorted.
