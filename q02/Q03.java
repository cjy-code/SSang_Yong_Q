package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번쨰 숫자 : ");
		int n1 = Integer.parseInt(br.readLine());
		System.out.print("두번째 숫자 : ");
		int n2 = Integer.parseInt(br.readLine());
		
		add(n1, n2);
		add(n1, n1);
		
		substract(n1, n2);
		
		multiply(n1, n2);
		multiply(n1, n1);
		
		divide(n1, n2);
		
		mod(n1, n2);
		

		
		
		
	}//main
	public static void add(int n1, int n2) {
		System.out.println(n1+n2);
	  
	}
	
	public static void substract(int n1, int n2) {
		System.out.println(n1 - n2);
		
	}
	
	public static void multiply(int n1, int n2) {
		System.out.println(n1 * n2);
		
		
	}
	
	public static void divide(int n1, int n2) {
		System.out.printf("%.1f\n",(n1/(double)n2));
		
		
		
	}
	
	public static void mod(int n1, int n2) {	
		System.out.println(n1 % n2);
		
	}

}
