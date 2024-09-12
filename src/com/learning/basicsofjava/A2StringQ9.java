package com.learning.basicsofjava;

import java.util.Scanner;

public class A2StringQ9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();
        scan.close();
        String[] words = sentence.trim().split("\\s+");  // Splitting by space
        System.out.println("The number of words is: " + words.length);
    }
}