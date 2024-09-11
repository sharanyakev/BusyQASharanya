package com.learning.basicsofjava;

import java.util.Scanner;

public class A1Qn2Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int number1 = num1.nextInt();
		
		System.out.println("Enter second number: ");
		int number2 = num1.nextInt();
		
		int add = number1+number2;
		System.out.println("Sum of the entered numbers is: " + (add));
		num1.close();
	}
}