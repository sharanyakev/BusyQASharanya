package com.learning.basicsofjava;

import java.util.Scanner;

public class A1Loop2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the number of values:");
			int n = scan.nextInt();
			
			System.out.println("Enter the"+ n +"values");
			int j;
			int[] a = new int[n];
			for(j=0;j<n;j++)
			{
				a[j] = scan.nextInt();
			}
			
			int large = a[0];
			int i;
			
			for(i=0;i<n;i++) {
				if(large<a[i])
				{
					large = a[i];
				}
			}
			System.out.println("The Largest number is "+large);
			scan.close();
		}
	}

}
