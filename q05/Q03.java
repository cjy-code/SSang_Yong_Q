package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자 : ");
		int input1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 숫자 : ");
		int input2 = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 : ");
		String oper = br.readLine();
		if(oper.equals("+")) {
			System.out.printf("%d %s %d = %d", input1, oper, input2, input1+input2);
		}else if(oper.equals("-")){
			System.out.printf("%d %s %d = %d", input1, oper, input2, input1-input2);
		}else if(oper.equals("*")){
			System.out.printf("%d %s %d = %d", input1, oper, input2, input1*input2);
		}else if(oper.equals("/")){
			System.out.printf("%d %s %d = %d", input1, oper, input2, input1/input2);
		}else if(oper.equals("%")){
			System.out.printf("%d %s %d = %d", input1, oper, input2, input1%input2);
		}
		

	}

}
