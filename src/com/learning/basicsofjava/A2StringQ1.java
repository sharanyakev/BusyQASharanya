package com.learning.basicsofjava;

public class A2StringQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Sharanya";
        String str2 = "sharanya";

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The strings are equal, ignoring case.");
        } else {
            System.out.println("The strings are not equal.");
        }
	}

}
