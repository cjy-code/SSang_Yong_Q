package com.test.question.q04;

import java.util.Calendar;

public class Q01 {

	public static void main(String[] args) {
		
		nowTime();
		nowTime_AMPM();
		
	}//main

	private static void nowTime_AMPM() {
        Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int min =now.get(Calendar.MINUTE); 
		int sec = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM);
		String strAmpm = (ampm == Calendar.AM) ? "오전" : "오후";
		
		//12H
		System.out.printf("%s %02d시 %02d분 %02d초\n",strAmpm, hour%12, min, sec);
		
		//24H
		System.out.printf("%02d %02d %02d초\n", now.get(Calendar.HOUR_OF_DAY), min, sec);
		
		
	}

	private static void nowTime() {
		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int min =now.get(Calendar.MINUTE); 
		int sec = now.get(Calendar.SECOND);
		
		System.out.printf("현재 시간 : %02d시 %02d분 %02d초\n", hour, min ,sec);
			
	}
	

}
