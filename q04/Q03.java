package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도 : ");
		int birthday = Integer.parseInt(br.readLine());
		
		Calendar now = Calendar.getInstance();
						
		System.out.printf("나이 : %d세\n", (now.get(Calendar.YEAR)-birthday));
		
		
	}

}
