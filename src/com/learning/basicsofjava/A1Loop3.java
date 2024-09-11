package com.learning.basicsofjava;

import java.util.Scanner;

public class A1Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month:");
		String month = scan.nextLine();
		scan.close();
		int day = 1;
		switch(month)
		{
			case "January":
			case "March":
			case "May":
			case "July":
			case "August":
			case "October":
			case "December":
				day = 31;
			break;
			case "April":
			case "June":
			case "September":
			case "November":
				day = 30;
			break;
			case "February":
				day = 28;
			break;
			default:
				day = 0;
		}
		System.out.println("Number of days = "+ day);
	}
	
}
