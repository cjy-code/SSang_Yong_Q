package com.test.question.q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("학생수: ");
		int count = Integer.parseInt(br.readLine());
		String[] name = new String[count];
		
		
		for(int i=0; i<count; i++) {
			System.out.print("학생명: ");
			String input = br.readLine();
			name[i] = input;
			
			if(i== count-1) {
			System.out.printf("\n입력한 학생은 총 %d명 입니다.\n",i+1);
			}
		}
		
		int num=0;
		
		for(int i=name.length-1; i>=0; i--) {
			
			num++;
			System.out.printf("%d. %s\n",num,name[i]);
			
		}
		
		
		
	}

}
