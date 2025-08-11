package com.palle;

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
        int x = 99; // element to insert
        int y = 2;  // index where to insert

        // Create new array with size + 1
        int[] newArr = new int[arr.length + 1];

        // Copy elements before index y
        for (int i = 0; i < y; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element at index y
        newArr[y] = x;

        // Copy remaining elements after y
        for (int i = y; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("After insertion: " + Arrays.toString(newArr));
	}

}
