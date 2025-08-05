package com.palle;

public class LinearSearch {
		  public static int linearSearch(int[] ar, int value) {
		        for (int i = 0; i < ar.length; i++) {
		            if (ar[i] == value) {
		                return i;
		            }
		        }
		        return -1;
		    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			   int[] numbers = {10, 25, 30, 45, 50};
		        int value =10;

		        int result = linearSearch(numbers,value);

		        if (result != -1) {
		            System.out.println("Element found at index: " + result);
		        } 
		        else {
		            System.out.println("Element not found in the array.");
		        }
	}

}

