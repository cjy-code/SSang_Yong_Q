package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		String data1 = br.readLine();
		System.out.print("기어비를 입력해 주세요 : ");
		String data2 = br.readLine();
		
		int Count = Integer.parseInt(data1);
		int Gear= Integer.parseInt(data2);
		
		double wheel = 3.14 * 26 * Gear;
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,fm를 달렸습니다.", Count, wheel*Count);
		
		
		
	}

}
