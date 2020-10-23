package com.test.question.q03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� �� : ");
		int sunny = Integer.parseInt(br.readLine());
		System.out.print("�帰 �� : ");	
		int cloudy = Integer.parseInt(br.readLine());
		
		System.out.printf("����� �� %d�� ���Ƚ��ϴ�.",getApple(sunny, cloudy));

	}//main
	
	public static int getApple(int sunny, int cloudy) {
	
	   int sunny_Day = sunny*5;
	   int cloudy_Day = cloudy*2;
	   int sum = sunny_Day + cloudy_Day;
	   
	   int apple = sum >= 100 ? (sum-100)/10 : 0 ;
	   
	   
		return apple;
		
	}

}
