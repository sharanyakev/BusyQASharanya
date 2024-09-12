package com.learning.basicsofjava;

import java.util.Scanner;

public class A2StringQ8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        System.out.println("Enter a character to count: ");
        char ch = scan.next().charAt(0);
        scan.close();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The character '" + ch + "' appears " + count + " times.");
    }
}
