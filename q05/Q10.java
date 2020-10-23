package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("근무 년수 : ");
			int year = Integer.parseInt(br.readLine());
			
		rank(year);

	}//main

	private static void rank(int year) {
		
		if(year >= 1 && year <= 4) {
			System.out.printf("%d년차 초급 개발자입니다\n",year);
			if(year ==1) {
		     	System.out.printf("앞은로 4년 더 근무를 하면 중급 개발자가 됩니다.\n");
			}else if(year ==2) {
				System.out.printf("앞은로 3년 더 근무를 하면 중급 개발자가 됩니다.\n");
			}else if(year ==3)  {
				System.out.printf("앞은로 2년 더 근무를 하면 중급 개발자가 됩니다.\n");
			}else if(year ==4) {
				System.out.printf("앞은로 1년 더 근무를 하면 중급 개발자가 됩니다.\n");
		    }
			
		
	    }else if(year >= 5 && year <= 9) {
			System.out.printf("%d년차 중급 개발자입니다\n", year);
			if(year == 5) {
				System.out.printf("당신은 1년전까지 초급 개발자였습니다.\n");
			    System.out.printf("앞은로 5년 더 근무를 하면 고급 개발자가 됩니다.\n");
			}else if(year ==6) {
				System.out.printf("당신은 2년전까지 초급 개발자였습니다.\n");
				System.out.printf("앞은로 4년 더 근무를 하면 고급 개발자가 됩니다.\n");
			}else if(year ==7)  {
				System.out.printf("당신은 3년전까지 초급 개발자였습니다.\n");
				System.out.printf("앞은로 3년 더 근무를 하면 고급 개발자가 됩니다.\n");
			}else if(year ==8) {
				System.out.printf("당신은 4년전까지 초급 개발자였습니다.\n");
				System.out.printf("앞은로 2년 더 근무를 하면 고급 개발자가 됩니다.\n");
		    }else if(year ==9) {
		    	System.out.printf("당신은 5년전까지 초급 개발자였습니다.\n");
				System.out.printf("앞은로 1년 더 근무를 하면 고급 개발자가 됩니다.\n");
	        }
        }else{
        	    System.out.printf("%d년차 고급 개발자입니다.\n",year);    
             	System.out.printf("당신은 %d년전까지 중급 개발자였습니다.",year-10);
        	    
        }
		
		
	}//rank(int year);
}
