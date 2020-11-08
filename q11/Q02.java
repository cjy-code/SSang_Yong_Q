package com.test.question.q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			int input = Integer.parseInt(br.readLine());
			
			num[i] = input;
			//System.out.println(num[i]);
			
		}
		
		System.out.println();
		
		for(int i=num.length-1; i>=0; i--) {
			
			System.out.printf("num[%d] = %d\n",i,num[i]);
			
		}
		
		
		
		
	}

}
