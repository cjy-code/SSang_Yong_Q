package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��° ���� : ");
		int input1 = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ���� : ");
		int input2 = Integer.parseInt(br.readLine());
		
		System.out.print("������ : ");
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
