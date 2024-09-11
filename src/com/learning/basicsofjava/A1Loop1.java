package com.learning.basicsofjava;

import java.util.Scanner;

public class A1Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = number.nextInt();
		
		if (num>=0) {
				System.out.println("This is a positive number");
	}
		else {
			System.out.println("This is a negative number");
		}
		number.close();
}

}
