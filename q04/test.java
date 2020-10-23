package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
			
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("숫자 입력 : ");
			long input = Integer.parseInt(br.readLine());
	   
	   long a = Integer.parseInt(br.readLine());
	   System.out.printf("%d",a);
		Operator(input);
	}//main

	private static void Operator(long input) {
		
		if(input>= -128 && input <= 127) {
			System.out.println("byte");
		} else if(input>= -32768 && input <= 32767) {
			System.out.println("byte");
			System.out.println("short");
		} else if(input>= -2147483648 && input <= 2147483647) {
			System.out.println("byte");
			System.out.println("short");
			System.out.println("int");
		} else
			System.out.println("byte");
			System.out.println("short");
			System.out.println("int");
			System.out.println("long");
	}//Operator()
}
