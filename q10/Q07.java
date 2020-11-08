package com.test.question.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단어: ");
		String str = br.readLine();
		String temp ="";
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			count++;
			char c = str.charAt(i);
			
			if(i != 0) {
				if(c >= 'A' && c <='Z') {
					break;
				}
			}
		}//for
		
		temp = str.substring(0, count-1);
		temp +=" ";
		temp +=str.substring(count-1);
		System.out.printf("결과: %s",temp);
		
	}

}
