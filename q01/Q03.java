package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�ʺ�(cm) : ");
		String data1 = br.readLine();
		System.out.print("����(cm) : ");
		String data2 = br.readLine();
		
		int Width= Integer.parseInt(data1);
		int Height = Integer.parseInt(data2);
		
		System.out.printf("�簢�� ���̴� %dcm���Դϴ�.\n", (Height*Width));
		System.out.printf("�簢�� �ѷ��� %dcm�Դϴ�.",(Height * 2 + Width *2));
		
	}

}
