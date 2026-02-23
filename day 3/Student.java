package com.debs;

public class Student {
	String Name;
	int Marks;
	
	void display() {
		System.out.println(Name+Marks);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Name = "Rahul";
		s1.Marks = 88;
		s1.display();
	}

}
