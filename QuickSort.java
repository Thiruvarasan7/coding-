package com.palle;

import java.util.Arrays;

public class QuickSort {

	 public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(arr, low, high); // Get pivot index
	            quickSort(arr, low, pivotIndex - 1);        // Sort left part
	            quickSort(arr, pivotIndex + 1, high);       // Sort right part
	        }
	    }

	    public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];  // Choose last element as pivot
	        int i = low - 1;        // Index of smaller element

	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                // Swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // Swap pivot to correct position
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1; // Return pivot index
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int[] nums = {10, 7, 8, 9, 1, 5};
	        quickSort(nums, 0, nums.length - 1);
	        System.out.println("Sorted Array: " + Arrays.toString(nums));
	}

}
