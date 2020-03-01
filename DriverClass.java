package sorting;

public class DriverClass {

	public static void main(String[] args) {
		int arr[] = {0,50,40,-2,30,20,10,2,-1,-5,-5};
		
		//SelectionSort.selectionSort(arr);
		//BubbleSort.bubbleSort(arr);
		//MergeSort.mergeSort(arr);
		//InsertionSort.insertionSort(arr);
		
		PrintClass.printArray(arr);
		System.out.println("Sorted data :- ");
		QuickSort.quickSort(arr, 0, arr.length-1);
		PrintClass.printArray(arr);
	}

}
