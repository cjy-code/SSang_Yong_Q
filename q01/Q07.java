package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : ");
		String data1 = br.readLine();
		System.out.print("두번째 숫자 : ");
		String data2 = br.readLine();
		
		int Input1 = Integer.parseInt(data1);
		int Input2 = Integer.parseInt(data2);
		
		int result = (Input1 > Input2) ? Input1 : Input2;
		
		System.out.printf("%d와(과) %d 중에 더 큰 숫자는 %d입니다.", Input1, Input2, result);
		
		
		
		
		
		
	}

}
