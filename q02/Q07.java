package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� : ");
		int Kor = Integer.parseInt(br.readLine());
		System.out.print("���� : ");
		int Eng = Integer.parseInt(br.readLine());
		System.out.print("���� : ");
		int Math = Integer.parseInt(br.readLine());
		
		System.out.printf("%s�Դϴ�", test(Kor, Eng, Math));

		
		
		
		
	}//Main
	
	public static String test(int Kor, int Eng, int Math) {
		int Avr = (Kor + Eng + Math)/3 ;
		
		String result = Avr < 60 ? "(��)�հ�" :
			            Kor < 40 ? "(��)�հ�" :
			            Eng < 40 ? "(��)�հ�" :
			            Math < 40 ? "(��)�հ�" : "�հ�";
		
		return result;
	}
	
	

}
