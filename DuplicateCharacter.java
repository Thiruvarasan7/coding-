package com.palle;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		LinkedHashMap<Character,Integer> hs=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(hs.containsKey(ch)==true) {
				int val=hs.get(ch);
				hs.put(ch,val+1);
			}
			else {
				hs.put(ch,1);
			}
		}
		for(Map.Entry<Character,Integer> entry:hs.entrySet()) {
			char key=entry.getKey();
			int val=entry.getValue();
			if(val>1) {
				System.out.println(key+" is occuring at "+val+" times");
			}
		}
	}

}
