package com.learning.basicsofjava;

public class BooleanOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 6;
		int c = 5;
		
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);
         
        System.out.println("condition value equals check: isGreaterThan :" + isGreaterThan);
        System.out.println("condition value equals check: isLessThan :" + isLessThan);
        System.out.println("condition value equals check: isGreaterOrEqual :" + isGreaterOrEqual);
        System.out.println("condition value equals check: isLessOrEqual :" + isLessOrEqual);
        
        boolean logAnd = ((a==c) && (a<b));
		boolean logAndfalse = ((a!=c) && (a<b));
		boolean logicalOr = ((a==c) || (a<b));
		boolean logicalOrfasle = ((a!=c) || (a>b));
		boolean logicalnot = (!(a==c)); 
		
		System.out.println("condition value equals check: logAnd :" + logAnd);
		System.out.println("condition value equals check: logAndfalse :" + logAndfalse);
		System.out.println("condition value equals check: logicalOr :" + logicalOr);
		System.out.println("condition value equals check: logicalOrfasle :" + logicalOrfasle);
		System.out.println("condition value equals check: logicalnot :" + logicalnot);
	}

}
