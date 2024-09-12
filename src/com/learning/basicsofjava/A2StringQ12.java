package com.learning.basicsofjava;

import java.util.Scanner;

public class A2StringQ12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string with spaces: ");
        String str = scan.nextLine();
        scan.close();
        String result = str.replaceAll("\\s+", ""); 
        System.out.println("String after removing whitespaces: " + result);
    }
}