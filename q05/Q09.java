package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q09 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("�� : ");
			int year = Integer.parseInt(br.readLine());
		System.out.print("�� : ");
			int month = Integer.parseInt(br.readLine());
		System.out.print("�� : ");
			int date = Integer.parseInt(br.readLine());
		
		output(year, month, date);
	}

	private static void output(int year, int month, int date) {
		
		Calendar c1 = Calendar.getInstance();
		c1.set(year, month-1, date);
		
		int week = c1.get(Calendar.DAY_OF_WEEK);
		
		
		
		if(week == 1) {
			System.out.printf("�Է��Ͻ� ��¥�� '����'�Դϴ�\n");
			System.out.printf("����� �����ϴ�.\n");
		} else if(week == 2) {
			c1.add(Calendar.DATE,5);
			System.out.printf("�Է��Ͻ� ��¥�� '����'�Դϴ�\n");
			System.out.printf("�ش� ���� ����Ϸ� �̵��մϴ�.\n");
			System.out.printf("�̵��� ��¥�� %tF\n", c1);
		} else if(week == 3) {
			c1.add(Calendar.DATE,4);
			System.out.printf("�Է��Ͻ� ��¥�� '����'�Դϴ�\n");
			System.out.printf("�ش� ���� ����Ϸ� �̵��մϴ�.\n");
			System.out.printf("�̵��� ��¥�� %tF\n", c1);
		} else if(week == 4) {
			c1.add(Calendar.DATE,3);
			System.out.printf("�Է��Ͻ� ��¥�� '����'�Դϴ�\n");
			System.out.printf("�ش� ���� ����Ϸ� �̵��մϴ�.\n");
			System.out.printf("�̵��� ��¥�� %tF\n", c1);
		} else if(week == 5) {
			c1.add(Calendar.DATE,2);
			System.out.printf("�Է��Ͻ� ��¥�� '����'�Դϴ�\n");
			System.out.printf("�ش� ���� ����Ϸ� �̵��մϴ�.\n");
			System.out.printf("�̵��� ��¥�� %tF\n", c1);
		} else if(week == 6) {
			c1.add(Calendar.DATE,1);
			System.out.printf("�Է��Ͻ� ��¥�� '����'�Դϴ�\n");
			System.out.printf("�ش� ���� ����Ϸ� �̵��մϴ�.\n");
			System.out.printf("�̵��� ��¥�� %tF\n", c1);
		} else if(week == 7) {
			System.out.printf("�Է��Ͻ� ��¥�� '����'�Դϴ�\n");
			System.out.printf("����� �����ϴ�.\n");
		}
	
		
		
	}
	

}
