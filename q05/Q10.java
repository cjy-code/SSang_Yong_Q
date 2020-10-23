package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("�ٹ� ��� : ");
			int year = Integer.parseInt(br.readLine());
			
		rank(year);

	}//main

	private static void rank(int year) {
		
		if(year >= 1 && year <= 4) {
			System.out.printf("%d���� �ʱ� �������Դϴ�\n",year);
			if(year ==1) {
		     	System.out.printf("������ 4�� �� �ٹ��� �ϸ� �߱� �����ڰ� �˴ϴ�.\n");
			}else if(year ==2) {
				System.out.printf("������ 3�� �� �ٹ��� �ϸ� �߱� �����ڰ� �˴ϴ�.\n");
			}else if(year ==3)  {
				System.out.printf("������ 2�� �� �ٹ��� �ϸ� �߱� �����ڰ� �˴ϴ�.\n");
			}else if(year ==4) {
				System.out.printf("������ 1�� �� �ٹ��� �ϸ� �߱� �����ڰ� �˴ϴ�.\n");
		    }
			
		
	    }else if(year >= 5 && year <= 9) {
			System.out.printf("%d���� �߱� �������Դϴ�\n", year);
			if(year == 5) {
				System.out.printf("����� 1�������� �ʱ� �����ڿ����ϴ�.\n");
			    System.out.printf("������ 5�� �� �ٹ��� �ϸ� ��� �����ڰ� �˴ϴ�.\n");
			}else if(year ==6) {
				System.out.printf("����� 2�������� �ʱ� �����ڿ����ϴ�.\n");
				System.out.printf("������ 4�� �� �ٹ��� �ϸ� ��� �����ڰ� �˴ϴ�.\n");
			}else if(year ==7)  {
				System.out.printf("����� 3�������� �ʱ� �����ڿ����ϴ�.\n");
				System.out.printf("������ 3�� �� �ٹ��� �ϸ� ��� �����ڰ� �˴ϴ�.\n");
			}else if(year ==8) {
				System.out.printf("����� 4�������� �ʱ� �����ڿ����ϴ�.\n");
				System.out.printf("������ 2�� �� �ٹ��� �ϸ� ��� �����ڰ� �˴ϴ�.\n");
		    }else if(year ==9) {
		    	System.out.printf("����� 5�������� �ʱ� �����ڿ����ϴ�.\n");
				System.out.printf("������ 1�� �� �ٹ��� �ϸ� ��� �����ڰ� �˴ϴ�.\n");
	        }
        }else{
        	    System.out.printf("%d���� ��� �������Դϴ�.\n",year);    
             	System.out.printf("����� %d�������� �߱� �����ڿ����ϴ�.",year-10);
        	    
        }
		
		
	}//rank(int year);
}
