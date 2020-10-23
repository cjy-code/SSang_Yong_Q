package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("숫자 입력 : ");
			int input1 = Integer.parseInt(br.readLine());
			System.out.print("숫자 입력 : ");
			int input2 = Integer.parseInt(br.readLine());
			System.out.print("숫자 입력 : ");
			int input3 = Integer.parseInt(br.readLine());
			System.out.print("숫자 입력 : ");
			int input4 = Integer.parseInt(br.readLine());
			System.out.print("숫자 입력 : ");
			int input5 = Integer.parseInt(br.readLine());
			
			num(input1, input2, input3, input4, input5);
			
			
		   
			
		
	}

	private static void num(int input1, int input2, int input3, int input4, int input5) {
		int odd =0;
		int even =0;
		if(input1 % 2 ==0) {
			even++; 
		}else odd++;
		
		if(input2 % 2 ==0) {
			even++; 
		}else odd++;
		
		if(input3 % 2 ==0) {
			even++; 
		}else odd++;
		
		if(input4 % 2 ==0) {
			even++; 
		}else odd++;
		
		if(input5 % 2 ==0) {
			even++; 
		}else odd++;
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		
		if(even > odd) {
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.\n", even-odd);
		}else if(even== odd) {
			System.out.printf("짝수와 홀수의 개수가 같습니다\n");
		}else
			System.out.printf("홀수가 짝수보다 %d개 많습니다.\n", odd-even);
	}

}
