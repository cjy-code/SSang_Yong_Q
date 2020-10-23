package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q04 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Calendar first_Day = Calendar.getInstance();
		
		
		System.out.printf("남자 이름 : ");
		String man_name = br.readLine();
		
		System.out.printf("여자 이름 : ");
		String she_name = br.readLine();
		
		System.out.printf("만난날(년) : ");
	    int year = Integer.parseInt(br.readLine());
		
	    System.out.printf("만난날(월) : ");
		int month = Integer.parseInt(br.readLine());
		
		System.out.printf("만난날(일) : ");
		int date = Integer.parseInt(br.readLine());
		first_Day.set(year, month-1, date, 0, 0);
		
		System.out.println();
		System.out.println();
		
		
		System.out.printf("'%s'과(와) '%s'의 기념일\n", man_name, she_name);
		first_Day.add(first_Day.DATE, 100);
		System.out.printf("100일 : %tF\n", first_Day);
		first_Day.add(first_Day.DATE, 100);
		System.out.printf("200일 : %tF\n", first_Day);
		first_Day.add(first_Day.DATE, 100);
		System.out.printf("300일 : %tF\n", first_Day);
		first_Day.add(first_Day.DATE, 200);
		System.out.printf("500일 : %tF\n", first_Day);
		first_Day.add(first_Day.DATE, 500);
		System.out.printf("1000일 : %tF\n", first_Day);
		
		
		
		
	}

}
