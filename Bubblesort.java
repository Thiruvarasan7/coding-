package com.sample;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {5, 3, 8, 4, 2};

	        System.out.println("Before sorting:");
	        printArray(arr);

	        bubbleSort(arr);

	        System.out.println("After sorting:");
	        printArray(arr);
	    }

	    static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        boolean swapped;

	        // Outer loop
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;

	            // Inner loop
	            for (int j = 0; j < n - 1 - i; j++) {
	                // Swap if the element is greater than the next
	                if (arr[j] > arr[j + 1]) {
	                    // Swapping
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;

	                    swapped = true;
	                }
	            }

	            // If no elements were swapped in inner loop, array is sorted
	            if (!swapped)
	                break;
	        }
	    }

	    static void printArray(int[] arr) {
	        for (int value : arr)
	            System.out.print(value + " ");
	        System.out.println();
        
	}

}
