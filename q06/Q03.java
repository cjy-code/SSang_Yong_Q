package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
	
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("¼ýÀÚ : ");
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i=0; i <= num; i++) {
			
			result += i;
		}
		System.out.printf("1 ~ %,d = %,d\n", num, result);
		
		
	}

}
