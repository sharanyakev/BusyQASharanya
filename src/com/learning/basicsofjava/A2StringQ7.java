package com.learning.basicsofjava;

public class A2StringQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "This is September";
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversedStr);
	}

}
