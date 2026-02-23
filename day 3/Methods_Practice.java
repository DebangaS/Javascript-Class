//In java everything is a method no functions
package com.debs;

class Greeting{
	//Normal Methods
	void Hello() {
		System.out.println("Hey how are you?");
	}
	//Parameterized method
	void add(int a, int b) {
		System.out.println(a+b);
	}
}

class Hey {
	static void sayHi() {
		System.out.println("Hey there !!!");
	}
}

public class Methods_Practice {
	public static void main(String[] args) {
	Greeting a = new Greeting();
	a.Hello();
	a.add(12, 11);
	Hey.sayHi();
	}
}
