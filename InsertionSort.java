package com.sample;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Before sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];        // Current element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key; // Insert key at correct position
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
	}

}
