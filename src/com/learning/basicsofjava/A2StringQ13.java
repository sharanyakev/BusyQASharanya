package com.learning.basicsofjava;

import java.util.Scanner;

public class A2StringQ13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        scan.close();
        String reverse = new StringBuilder(str).reverse().toString();  

        if (str.equals(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}