package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("����ڰ� ����� ���� Ƚ�� : ");
		String data1 = br.readLine();
		System.out.print("���� �Է��� �ּ��� : ");
		String data2 = br.readLine();
		
		int Count = Integer.parseInt(data1);
		int Gear= Integer.parseInt(data2);
		
		double wheel = 3.14 * 26 * Gear;
		
		System.out.printf("����ڰ� �� %,dȸ ����� ��� �����Ű� �� %,fm�� �޷Ƚ��ϴ�.", Count, wheel*Count);
		
		
		
	}

}
