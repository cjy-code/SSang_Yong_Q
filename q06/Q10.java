package com.test.question.q06;

public class Q10 {
	
	public static void main(String[] args) {
		
		
		int sum = 0;
		
		for(int year=1; year<2020; year++) {
			if((year % 4 ==0 && year %100 !=0) || year % 400 == 0) {
				sum += 1;
			}
		}//for
		
		System.out.printf("2020년 10월 23일은 %,d일째 되는 날입니다.", sum+(2020*365)+293);
		
	}

}
