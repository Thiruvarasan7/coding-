package com.palle;

import java.util.LinkedHashMap;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="palle technology Private Limited";
		String ar[]=s.split(" ");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
	}

}
