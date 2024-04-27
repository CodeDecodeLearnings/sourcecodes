package com.lambda;

public class BubbleSort {
	public static void main(String[] args) {

		int[] array = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("Original array");
		printArray(array);
		bubbleSort(array);

		System.out.println("\nSorted array:");
		printArray(array);

	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();

	}

	static void bubbleSort(int[] array) {
		int n = array.length;// 7
		System.out.println(n);
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// compare adjacent elements
				if (array[j] > array[j + 1]) {
					// swap them if they are in the wrong order
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

}
