package com.learning.basicsofjava;

import java.util.Scanner;

public class A1Loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = scan.nextInt();
		scan.close();
		int x = 0;
		while(number != 0) {
			number = number/10;
			x = x+1;
		}
		System.out.println("The number of digits is:"+x);
		
	}

}
