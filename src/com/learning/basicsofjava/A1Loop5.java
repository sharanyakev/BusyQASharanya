package com.learning.basicsofjava;

import java.util.Scanner;

public class A1Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = scan.nextInt();
		scan.close();
		int i;
		for(i=0;i<=10;i++) {
			System.out.println(i+"*"+number+"="+(i*number));
		}

	}

}
