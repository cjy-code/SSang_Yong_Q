package com.test.question.q01;

import java.io.IOException;

public class Q09 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("영문자 입력 : ");
		int Num1 = System.in.read();
        System.out.printf("입력한 문자 '%c'는 '%s'입니다\n", Num1,  (Num1 >=65 && Num1 <=90) ? "대문자" : "소문자");
	  
		
	}

}
