package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum = 0;
		
		for(int i=0; i < str.length(); i++) {
			
			char c =str.charAt(i);
			int a = (int)c-48;
			
			if(a>=1 && a<=9 ) {
				sum += a;
			}
			
		}
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.", sum);
		
		
	}
}
