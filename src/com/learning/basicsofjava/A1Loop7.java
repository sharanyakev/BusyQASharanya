package com.learning.basicsofjava;

import java.util.Scanner;

public class A1Loop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = scan.nextInt();
		scan.close();
		int reverse = 0;
		while(number != 0) {
			int x = number%10;
			reverse = reverse*10+x;
			number/=10;
		}
		System.out.println("The reversed number is "+reverse);
	}
}
