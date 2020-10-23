package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("너비(cm) : ");
		String data1 = br.readLine();
		System.out.print("높이(cm) : ");
		String data2 = br.readLine();
		
		int Width= Integer.parseInt(data1);
		int Height = Integer.parseInt(data2);
		
		System.out.printf("사각형 넓이는 %dcm²입니다.\n", (Height*Width));
		System.out.printf("사각형 둘레는 %dcm입니다.",(Height * 2 + Width *2));
		
	}

}
