package com.palle;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 3; // number of rotations

        int len = arr.length;
        n = n % len; // In case n > len

        for (int r = 0; r < n; r++) {
            int last = arr[len - 1];
            // shift right by one
            for (int i = len - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }

        System.out.println("After " + n + " rotations: " + Arrays.toString(arr));
	}

}
