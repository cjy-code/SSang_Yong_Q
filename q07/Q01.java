package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		
		System.out.print("�ִ� ���� : ");
		int max = Integer.parseInt(br.readLine());
		for(int i =1; i <= max; i++) {
			
			if(i/10 == 3 | i/10 == 6  | i/10 == 9 ) {
				if(i%10 == 3 | i%10 == 6  | i%10 == 9 ) {
					str += "¦¦! ";
					
					continue;
				}
				
				str += "¦ ";
				
			}else if (i%10 == 3 | i%10 == 6  | i%10 == 9  ) {
				str+="¦ ";
		
			}else { str += i+ " ";}
		
		
		}
		System.out.println(str);
	}
}
