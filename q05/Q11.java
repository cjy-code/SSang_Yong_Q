package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("숫자 입력 : ");
			long input = Long.parseLong(br.readLine());
			
	   
	   
		Operator(input);
	}//main

	private static void Operator(long input) {
		
		if(input>= -128 && input <= 127) {
			System.out.println("byte");
			System.out.println("short");
			System.out.println("int");
			System.out.println("long");
		} else if(input>= -32768 && input <= 32767) {
			System.out.println("short");
			System.out.println("int");
			System.out.println("long");
		} else if(input>= -2147483648 && input <= 2147483647) {
			System.out.println("int");
			System.out.println("long");
			
		} else if(input>= -9223372036854775808L && input <= 9223372036854775807L) 
			System.out.println("long");
			
		
		
	}//Operator()
}
