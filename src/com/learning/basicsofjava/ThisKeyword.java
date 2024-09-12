package com.learning.basicsofjava;



public class ThisKeyword {
	int a, b;
	
	int add (int a, int b) {// a=5 and b=5
		this.a = a;
		this.b = b;
		return b;
//		this.a = a;
//		this.b = b;
	}

	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}
