package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("날짜 입력 : ");
				
		int data = Integer.parseInt(br.readLine());
		
		String day= data % 7 == 1 ? "목요일" :
		         	data % 7 == 2 ? "금요일" :
		     		data % 7 == 3 ? "토요일" :
					data % 7 == 4 ? "일요일" :
					data % 7 == 5 ? "월요일" :
					data % 7 == 6 ? "화요일" : "수요일";
                  		      
		
		System.out.printf("입력하신 2020년 10월 %d일은 '%s'입니다.",data, day);
		
		
		
		
	}

}
