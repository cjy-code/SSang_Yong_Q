package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
		
    	for(int i=1; i > 0; i ++) {
    		System.out.println("=======================");
    		System.out.println("    자판기");
    		System.out.println("=======================");
    		System.out.println("1. 콜라		:700원");
    		System.out.println("2. 사이다	:600원");
    		System.out.println("1. 비타민500	:500원");
    		System.out.println("-----------------------");
    		System.out.print("금액 투입(원) : ");
            int input = Integer.parseInt(br.readLine());
            System.out.println("-----------------------");
    		System.out.print("음료선택(번호) : ");
    		int num = Integer.parseInt(br.readLine());
            int change =0;
    		
    		
    		if(num == 1) {
            	change = input - 700;
            	System.out.println("+콜라를 제공합니다.");
            	System.out.printf("잔돈 %,d원을 제공합니다\n",change);
            }else if(num == 2) {
            	change = input - 600;
            	System.out.println("+사이다를 제공합니다.");
            	System.out.printf("+잔돈 %,d원을 제공합니다\n",change);
            }else if(num == 3) {
            	change = input - 500;
            	System.out.println("+비타민500를 제공합니다.");
            	System.out.printf("+잔돈 %,d원을 제공합니다\n",change);
            }
    		System.out.println();
    		System.out.println("계속하시려면 엔터를 입력하세요");
    		String enter = br.readLine();
    		if(enter.equals("")){
    			continue;
    		}else { break;}
    		
    	}
	}
}
