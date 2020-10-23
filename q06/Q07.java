package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {
	
	public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("시작 숫자: ");
	int start = Integer.parseInt(br.readLine());
	System.out.print("종료 숫자: ");
	int finish = Integer.parseInt(br.readLine());
	int sum =0;
	
	
	
    for(int i=start; i <= finish; i++ ) {
    	
    	System.out.printf("%d",i);
    	
    	if(i%2 == 0) {
    		sum -= i;
    		
    		if(i==finish) {break;}
    		System.out.printf(" + ");
			
    	}else {
    		sum += i;
    	    if(i==finish) {break;}
    		System.out.print(" - ");
    	}
    }//for
    System.out.printf(" = %d",sum);
    
 }
}

	