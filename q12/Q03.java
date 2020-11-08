package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("금액(원): ");
		int money = Integer.parseInt(br.readLine());
		
		
		String unit[] = {"", "십","백","천","만"};
		readNum(money);
		String stringNum = Integer.toString(money);
		int j = stringNum.length()-1;
		
		System.out.print("원금 ");
		for(int i=0; i<stringNum.length(); i++) {
			
			int n =stringNum.charAt(i) -'0';
			
			if(readNum(n)!= null) {
				System.out.print(readNum(n));
				System.out.print(unit[j]);
			}
				j--;
		}
		System.out.print("원");
		
		
		
		
		
	}//main
	
	public static String readNum(int money) {
        switch (money) {
        case 1:
            return "일";
        case 2:
            return "이";
        case 3:
            return "삼";
        case 4:
            return "사";
        case 5:
            return "오";
        case 6:
            return "육";
        case 7:
            return "칠";
        case 8:
            return "팔";
        case 9:
            return "구";
        }
        return null;
    }
 
}


