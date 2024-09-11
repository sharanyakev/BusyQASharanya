package com.learning.basicsofjava;

public class A2Q5SmallLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 8, 9, 14};
        int smallest = array[0];
        int largest = array[0];
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Smallest element: " + smallest);
        System.out.println("Greatest element: " + largest);
	}

}
