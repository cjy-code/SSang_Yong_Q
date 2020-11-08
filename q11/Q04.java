package com.test.question.q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		int[] num = new int[length];
		String str = "" ;
		
		
		for(int i=0; i<length; i++) {
			
			num[i] = (int) (Math.random()*10+1);
			str += num[i];
			if (i < num.length - 1) {
				str += ",";
			}
		}//for
		
		System.out.printf("nums = [ %s ]\n", str);
		
		int count =0; // 난수 카운드 
		String sum = ""; // 난수 합 누적
		for(int i=0; i<num.length; i++) {
			count ++;
		    if(count == 2) {
		    	sum += num[i-1] + num[i];
		    	count =0;
		    	if(i < num.length-1) {
		    		sum += ", ";
		    	}
		    }
			
		}//for
		System.out.printf("result = [ %s ]", sum);
	}

}
