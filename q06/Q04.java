package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
	
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int odd_Sum =0;
		int even_Sum =0;
		
		System.out.println("입력할 숫자의 개수를 입력해주세요.");
		int count = Integer.parseInt(br.readLine());
		
		for(int i =1; i <= count; i++)
		{	
			System.out.print("숫자 : ");
			int input = Integer.parseInt(br.readLine());
			
			if(input%2 ==0) {
				even_Sum += input;
			}else
				odd_Sum += input;
		
		}
		   System.out.printf("짝수의 합: %d\n", even_Sum);
		   System.out.printf("홀수의 합: %d\n", odd_Sum);
		
		
  }
}
