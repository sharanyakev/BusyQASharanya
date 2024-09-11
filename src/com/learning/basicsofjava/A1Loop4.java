package com.learning.basicsofjava;

import java.util.Scanner;

public class A1Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year= scan.nextInt();
		scan.close();
		
		if(year/4 == 0)
		{
			if(year/100==0) {
				if(year/400==0) {
					System.out.println("This is a Leap Year");		
				}
				else {
					System.out.println("This is a not Leap Year");	
				}
			}
			else {
			System.out.println("This is a Leap Year");
		}
		}
		else
		{
			System.out.println("This is not a Leap Year");
		}
		}
}