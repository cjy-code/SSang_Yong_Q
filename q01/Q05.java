package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q05 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�Ѵ� ���� �ݾ�(��) : ");
		String data = br.readLine();
		
		int N = Integer.parseInt(data);
		int After_Money =(int) (N-N*3.3/100);
		int Tax = (int)(N*3.3/100);
		int Year_IC = 12 * After_Money - (int)(N*3.5/100);		
		
		System.out.printf("���� �ݾ�(��) : %,d\n", After_Money);
		System.out.printf("����(��) : %,d\n", Tax);
		System.out.printf("1�� �� ����(����) �ݾ�(��) : %,d\n", Year_IC);

	}

}
