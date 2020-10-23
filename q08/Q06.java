package com.test.question.q08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행의 갯수를 입력받으시오: ");
		int input = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<input; i++ ) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
		}
		
	}

}
