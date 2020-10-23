package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자 : ");
		int start_Num = Integer.parseInt(br.readLine());
	
		System.out.print("종료 숫자 : ");
		int finish_Num = Integer.parseInt(br.readLine());
		
		
		for (int i = start_Num; i <= finish_Num; i++) {

			System.out.printf("%d\n", i);

		}
		
		System.out.println();

		for (int i = start_Num; i <= finish_Num; i+=4) {

			System.out.printf("%d\n", i);
			
		}
  }
}