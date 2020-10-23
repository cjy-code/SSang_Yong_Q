package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자: ");
		String data1= br.readLine();
		
		System.out.print("두번째 숫자: ");
		String data2= br.readLine();
		
		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);
		
		System.out.printf("%d + %d = %d\n",   num1,num2,   (num1 + num2));
		System.out.printf("%d - %d = %d\n",   num1,num2,   (num1 - num2));
		System.out.printf("%d * %d = %d\n",   num1,num2,   (num1 * num2));
		System.out.printf("%d / %d = %.1f\n", num1,num2,   (num1 / (double)num2));
		System.out.printf("%d %% %d = %d\n",   num1,num2,   (num1 % num2));
		
		
		
		
		
		
	}

}
