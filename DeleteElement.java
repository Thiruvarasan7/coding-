package com.palle;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2; // index to delete (0-based)

        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return;
        }

        int[] newArr = new int[arr.length - 1];

        // Copy elements before index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // Copy elements after index
        for (int i = index; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("After deletion: " + Arrays.toString(newArr));
	}

}
