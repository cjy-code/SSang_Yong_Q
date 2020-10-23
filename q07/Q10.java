package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자 : ");
		int first = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 숫자 : ");
		int second = Integer.parseInt(br.readLine());
		
		String first_Factor_Str = "";
		String second_Factor_Str = "";
		String common_Factor_Str = "";
		
		 for(int i=1; i<=first && i<=second; i++) {
             if(first % i ==0) {
            	 first_Factor_Str += i + ", "; 
             }
             if(second % i ==0) {
            	 second_Factor_Str += i + ", "; 
             }
             if(first % i==0 && second % i==0) {
				 common_Factor_Str += i+", ";
			 }
			 

		 }//for(i)
		 System.out.printf("%d의 약수 : %s\n", first, first_Factor_Str);
		 System.out.printf("%d의 약수 : %s\n", second, second_Factor_Str);
		 System.out.printf("%d와 %d의 공약수 : %s\n", first,second, common_Factor_Str);
	}


}
	

