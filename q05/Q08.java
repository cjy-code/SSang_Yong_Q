package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년도 입력 : ");
		int input = Integer.parseInt(br.readLine());
		
		w_Year(input);
		
		
	}//main

	private static void w_Year(int input) {
		
		if((input%4) !=0) {
			System.out.printf("%d년은'평년'입니다.",input);
		}else if((input%100) != 0) {
			System.out.printf("%d년은'윤년'입니다.",input);			
		}else if((input%400) != 0) {
			System.out.printf("%d년은'평년'입니다.",input);			
		}else
			System.out.printf("%d년은'윤년'입니다.",input);
		
		
		
		
	}
	
	

}
