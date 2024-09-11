package com.learning.basicsofjava;

public class A2ArrayQ1Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] scores = {
		            {80, 88, 90},  
		            {85, 86, 92} 
		        };
		        int totalSharanya = 0, totalSharan = 0;
		        for (int i = 0; i < 3; i++) {
		            totalSharanya += scores[0][i];
		            totalSharan += scores[1][i];
		        }
		        double avgSharanya = (double) totalSharanya / 3;
		        double avgSharan = (double) totalSharan / 3;
		        System.out.println("Sharanya's average score: " + avgSharanya);
		        System.out.println("Sharan's average score: " + avgSharan);
	}

}
