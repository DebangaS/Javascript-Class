package com.debs;
import java.util.ArrayList;
public class Dynamic_Array_Practice {

	public static void main(String[] args) {
		
		//Dynamic Array
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		
		System.out.println(marks.remove(1));
		System.out.println(marks.set(1,90));
		System.out.println(marks);
		
		//Primitive
		int rollno = 10;
		System.out.println(rollno);
		
		//Objects
		Integer rollNo = 10;
		System.out.println(rollNo);
	}
}