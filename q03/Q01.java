package com.test.question.q03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("역의 개수 : ");
		int station = Integer.parseInt(br.readLine());
		System.out.print("환승역의 횟수 : ");
		int trans = Integer.parseInt(br.readLine());
		System.out.print("시간대를 입력하시오 : ");
		String time = br.readLine();
		
		System.out.printf("총 소요 시간은 %d분 입니다.",getTime(station, trans, time));
		

	}//main
	
	public static int getTime(int station, int trans,String time) {
	
	   int Time = time.equals("퇴근") ? 5 :
		          time.equals("출근") ? 4 : 3;
		
		return station*2+trans*Time;
		
	}

}
