package com.debs;

public class Array_Practice {

	public static void main(String[] args) {
		int[] marks = new int[4];
		marks[0] = 70;
		marks[1] = 80;
		marks[2] = 65;
		marks[3] = 90;
		
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println(marks.length);
	}

}
