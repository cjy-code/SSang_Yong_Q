package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어 : ");
		int Kor = Integer.parseInt(br.readLine());
		System.out.print("영어 : ");
		int Eng = Integer.parseInt(br.readLine());
		System.out.print("수학 : ");
		int Math = Integer.parseInt(br.readLine());
		
		System.out.printf("%s입니다", test(Kor, Eng, Math));

		
		
		
		
	}//Main
	
	public static String test(int Kor, int Eng, int Math) {
		int Avr = (Kor + Eng + Math)/3 ;
		
		String result = Avr < 60 ? "(불)합격" :
			            Kor < 40 ? "(불)합격" :
			            Eng < 40 ? "(불)합격" :
			            Math < 40 ? "(불)합격" : "합격";
		
		return result;
	}
	
	

}
