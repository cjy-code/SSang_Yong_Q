package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("��¥ �Է� : ");
				
		int data = Integer.parseInt(br.readLine());
		
		String day= data % 7 == 1 ? "�����" :
		         	data % 7 == 2 ? "�ݿ���" :
		     		data % 7 == 3 ? "�����" :
					data % 7 == 4 ? "�Ͽ���" :
					data % 7 == 5 ? "������" :
					data % 7 == 6 ? "ȭ����" : "������";
                  		      
		
		System.out.printf("�Է��Ͻ� 2020�� 10�� %d���� '%s'�Դϴ�.",data, day);
		
		
		
		
	}

}
