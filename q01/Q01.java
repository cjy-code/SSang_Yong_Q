package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�¾ �⵵: ");
		String N = br.readLine();
				
		int year = Integer.parseInt(N);
		
		int age = 2020 - year + 1;
		
		System.out.printf("���� : %d��", age);

	}

}
