package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("����(��C) : ");
		int  Temper= Integer.parseInt(br.readLine());
		
		System.out.printf("���� %d��C�� ȭ�� %.1f��F�Դϴ�",Temper,(float)(Temper*1.8+32));
		
		

	}
}
