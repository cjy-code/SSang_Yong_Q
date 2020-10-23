package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		int input = Integer.parseInt(br.readLine());
	
        digit(input);
		
		
		
		
		
	}//main
	
	public static void digit(int num) {
		/*
		  숫자 -> 문자열
		  1. Integer.toString(100 -> "100")
		  2. String.valueOf(100 -> "100")
		  3. 100 + "" -> "100"
		   
		  100 + "문자열" -> "100 문자열"
		  
		  String result = (num < 10) ? "000" + num : ((num <100) ? "00" +num
		                                           : ((num < 1000) ? "0" + num : num +""));
		  
		 */
		
		System.out.printf("%04d",num);
	}
	

}
