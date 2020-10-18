package com.rn.java;

public class ReverseStringByPreservingOrder {
	public static void main(String[] args) {		
		String str = "I Love Java";
		reverseStringByReservingOrder(str);
	}
	private static void reverseStringByReservingOrder(String str) {
		String[] split = str.split(" ");
		for(int i=0;i<split.length;i++) {
			String s = "";
			for(int j=split[i].length()-1;j>=0;j--) {
				s+=split[i].charAt(j);
			}
			System.out.print(s+" ");
		}
	}
}
