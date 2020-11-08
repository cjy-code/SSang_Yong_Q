package com.test.question.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		String str ="";
		int count =0;
		
		for(int i=num.length(); i>0; i--) {
			 count ++;
			 str += num.charAt(i-1);
			 if(i==1) {
				 break;
			 }
			 if(count==3) {
			     str+=",";
				 count=0;
			 }
		}//for
		
		for(int i=str.length(); i>0; i--) {
			System.out.print(str.charAt(i-1));
		}
		
		
	}

}
