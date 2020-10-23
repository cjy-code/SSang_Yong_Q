package com.test.question.q04;

import java.util.Calendar;

public class Q02 {
	
	public static void main(String[] args) {
		
        Calendar birthday = Calendar.getInstance();
		
       
		
		
		birthday.add(birthday.DATE, 100);
		System.out.printf("백일 : %tF\n", birthday);
		
		birthday.add(birthday.DATE, -100);
		birthday.add(birthday.YEAR, 1);
		System.out.printf("첫돌 : %tF\n", birthday);
		
	}//main

}
