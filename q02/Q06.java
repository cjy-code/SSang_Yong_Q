package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� : ");
		int input = Integer.parseInt(br.readLine());
		
		System.out.printf("�Է��Ͻ� ���� '%d'��(��) '%s'�Դϴ�.", input, getNumber(input));
		
		

	}// main
	
	public static String getNumber(int num) {
		
		String Hall_JJack = num%2 ==0 ? "¦��" : "Ȧ��";
		
		return Hall_JJack;
		
	}

}
