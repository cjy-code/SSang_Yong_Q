package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�̸� : ");
		String name = br.readLine();
		System.out.print("Ƚ�� : ");
		int count = Integer.parseInt(br.readLine());
		
		for(int i =1; i <= count; i++) {
			System.out.printf("%s�� �ȳ��ϼ���~\n", name);
		}
		

	}

}
