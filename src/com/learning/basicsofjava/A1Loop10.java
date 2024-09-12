package com.learning.basicsofjava;

public class A1Loop10 {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, n3;
        System.out.print("Fibonacci Series between 1 to 50: ");
        System.out.print(n1 + " " + n2); 

        while (true) {
            n3 = n1 + n2;
            if (n3 > 50) {
                break;
            }
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
