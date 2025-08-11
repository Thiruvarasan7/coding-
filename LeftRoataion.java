package com.palle;

import java.util.Arrays;

public class LeftRoataion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 3; // number of left rotations

        int len = arr.length;
        n = n % len; // in case n > len

        for (int r = 0; r < n; r++) {
            int first = arr[0];
            // shift left by one
            for (int i = 0; i < len - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[len - 1] = first;
        }

        System.out.println("After " + n + " left rotations: " + Arrays.toString(arr));
	}

}
