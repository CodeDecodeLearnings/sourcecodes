package com.lambda;

public class BubbleShorts {

	public static void main(String[] args) {
	 int[] array= {64,34,25,12,22,11,90};
	 
	 System.out.println("Original array:");
     printArray(array);

     bubbleSort(array);

     System.out.println("\nSorted array:");
     printArray(array);
	 	
	 

	}
	// Function to perform bubble sort on array
	static void bubbleSort(int[] array) {
		int n=array.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				// compare adjacent element
				if (array[j]>array[j+1]) {
					// swap them if they are in the wrong order
					int temp=array[j];
					array[j]=array[j+1];
					 
				}
			}
		}
	}
	// Function to print an array
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
	
}
}