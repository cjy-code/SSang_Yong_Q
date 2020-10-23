package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("점수 : ");
		int input = Integer.parseInt(br.readLine());
		
		if(input>=90 && input<=100) {
			String rank = "A";
			System.out.printf("입력한 %d점은 성적 %s입니다.", input, rank);
		} else if(input>=80 && input<=89) {
			String rank = "B";
			System.out.printf("입력한 %d점은 성적 %s입니다.", input, rank);
		} else if(input>=70 && input<=79) {
			String rank = "C";
			System.out.printf("입력한 %d점은 성적 %s입니다.", input, rank);
		} else if(input>=60 && input<=69) {
			String rank = "D";
			System.out.printf("입력한 %d점은 성적 %s입니다.", input, rank);
		} else if(input>=0 && input<=59) {
			String rank = "F";
			System.out.printf("입력한 %d점은 성적 %s입니다.", input, rank);
		} else System.out.println("범위 내 값이 아닙니다.");
		
		
		
		
	}

}
