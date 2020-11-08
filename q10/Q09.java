package com.test.question.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String jumin = br.readLine();
		
		String temp = jumin.replace("-", "");
		int sum = 0;
		
		
		for(int i=0; i<temp.length()-1; i++) {
			char c = temp.charAt(i);
			
			int num = (int)c-48;
			
			switch (i) {
			case 0:
				sum +=num*2;
				break;
			case 1:
				sum +=num*3;
				break;
			case 2:
				sum +=num*4;
				break;
			case 3:
				sum +=num*5;
				break;
			case 4:
				sum +=num*6;
				break;
			case 5:
				sum +=num*7;
				break;
			case 6:
				sum +=num*8;
				break;
			case 7:
				sum +=num*9;
				break;
			case 8:
				sum +=num*2;
				break;
			case 9:
				sum +=num*3;
				break;
			case 10:
				sum +=num*4;
				break;
			case 11:
				sum +=num*5;
				break;
			default:
				break;
			}
			
		}
		
		sum = (11-(sum % 11))%10;
	
		char cc = temp.charAt(12);
		int temp2 = (int) cc - 48;
		if (temp.length() == 13) {
			if (sum == temp2) {
				System.out.println("올바른 주민등록번호입니다.");
			} else {
				System.out.println("올바르지 않은 주민등록번호입니다.");
			}
		}else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}

	}

}
