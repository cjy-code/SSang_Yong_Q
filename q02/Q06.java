package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 : ");
		int input = Integer.parseInt(br.readLine());
		
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.", input, getNumber(input));
		
		

	}// main
	
	public static String getNumber(int num) {
		
		String Hall_JJack = num%2 ==0 ? "짝수" : "홀수";
		
		return Hall_JJack;
		
	}

}
