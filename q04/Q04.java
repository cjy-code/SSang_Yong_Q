package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q04 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Calendar first_Day = Calendar.getInstance();
		
		
		System.out.printf("���� �̸� : ");
		String man_name = br.readLine();
		
		System.out.printf("���� �̸� : ");
		String she_name = br.readLine();
		
		System.out.printf("������(��) : ");
	    int year = Integer.parseInt(br.readLine());
		
	    System.out.printf("������(��) : ");
		int month = Integer.parseInt(br.readLine());
		
		System.out.printf("������(��) : ");
		int date = Integer.parseInt(br.readLine());
		first_Day.set(year, month-1, date, 0, 0);
		
		System.out.println();
		System.out.println();
		
		
		System.out.printf("'%s'��(��) '%s'�� �����\n", man_name, she_name);
		first_Day.add(first_Day.DATE, 100);
		System.out.printf("100�� : %tF\n", first_Day);
		first_Day.add(first_Day.DATE, 100);
		System.out.printf("200�� : %tF\n", first_Day);
		first_Day.add(first_Day.DATE, 100);
		System.out.printf("300�� : %tF\n", first_Day);
		first_Day.add(first_Day.DATE, 200);
		System.out.printf("500�� : %tF\n", first_Day);
		first_Day.add(first_Day.DATE, 500);
		System.out.printf("1000�� : %tF\n", first_Day);
		
		
		
		
	}

}
