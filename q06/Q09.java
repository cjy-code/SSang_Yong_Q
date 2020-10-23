package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("누적값: ");
		int max = Integer.parseInt(br.readLine());
		System.out.println();
		int sum=0;
	    String str = "";
	   
			
			
			
	    for(int i=1; i>0 ; i++) {
				
				if(sum>max) {break;}
				System.out.print("숫자 : ");
				int input = Integer.parseInt(br.readLine());
				
	    	
	    	  if(i%2 == 0) {
	    		sum -= input;
	    		
	    		str += "" + input;
	    		if(sum>max) {break;}
	    		str +=  " + ";
	    		
	        	}else {
	    		sum += input;
	    		str += "" + input ;
	    	    if(sum>max) {break;}
	    	    str += " - ";
	    		
	    	    }
	    	  
	    	  
	    	    
		}//for
	    
		
		System.out.printf("%s= %d", str,sum);
		
}
}