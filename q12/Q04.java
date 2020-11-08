package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	
	//String str = "9@4"; Test
	
	str = str.replace(" ", ""); // 빈칸 지우기 "4 + 3"-> "4+3"
	
	int sum=0;
	
	
	
	if (str.length() < 3) { // str  길이가 3 이상
		System.out.println("피연산자가 부족합니다.");
		
	}else {
		int a = (int)str.charAt(0)-48;
		int b = (int)str.charAt(2)-48;
		if (str.charAt(1) == '+') {
			sum = a + b;
		} else if (str.charAt(1) == '-') {
			sum = a - b;
		} else if (str.charAt(1) == '*') {
			sum =a * b;
		} else if (str.charAt(1) == '/') {
			sum =a / b;
		} else if (str.charAt(1) == '%') {
			sum =a % b;
		} else
			System.out.println("연산자가 올바르지 않습니다.");
	}
	System.out.printf("%s %s %s = ",str.charAt(0)-48,str.charAt(1), str.charAt(2));
	System.out.println(sum);
}//main

}
