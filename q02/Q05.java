package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번쨰 숫자 : ");
		int n1 = Integer.parseInt(br.readLine());
		System.out.print("두번째 숫자 : ");
		int n2 = Integer.parseInt(br.readLine());
		
		int result = add(n1, n2);
		System.out.println(result);
	    result = add(n1, n1);
	    System.out.println(result);
		
	    result =substract(n1, n2);
	    System.out.println(result);
		
	    result =multiply(n1, n2);
	    System.out.println(result);
	    result =multiply(n1, n1);
	    System.out.println(result);
		
	    double result2 = divide(n1, n2);	
	    System.out.println(String.format("%.1f",result2));
	    result =mod(n1, n2);
	    System.out.println(result);
		
		
	}//main
	public static int add(int n1, int n2) {
		int add = n1 + n2;
		return add;
	  
	}
	
	public static int substract(int n1, int n2) {
		int substract = n1 - n2;
		return substract;
	}
	
	public static int multiply(int n1, int n2) {
		int multiply = n1 * n2;
		return multiply;
		
		
	}
	
	public static double divide(int n1, int n2) {
		double divide = n1 / (double)n2;
		return divide;
		
	}
	
	public static int mod(int n1, int n2) {
		int mod = n1 % n2;
		
		return mod;
		
	}




}
