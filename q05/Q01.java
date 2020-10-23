package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.print("첫번째 숫자 : ");
	    int num1 = Integer.parseInt(br.readLine());
	    
	    System.out.print("두번째 숫자 : ");
	    int num2 = Integer.parseInt(br.readLine());
	    
	    if(num1 > num2) {
	    	System.out.printf("큰수는 %d이고, 작은수는 %d입니다\n", num1, num2);
	    	System.out.printf("입력한 구 숫자는 %d가 차이납니다.",num1-num2);
	    } else if(num1 < num2) {
	    	System.out.printf("큰수는 %d이고, 작은수는 %d입니다\n", num2, num1);
	    	System.out.printf("입력한 구 숫자는 %d가 차이납니다.",num2-num1);    
	    } else System.out.println("두수는 같습니다");
		
	}

}
