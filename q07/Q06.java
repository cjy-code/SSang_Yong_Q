package com.test.question.q07;



public class Q06 {

public static void main(String[] args)  {
    	
	int num = 1;
	int sum = 0;
	String str = "";
	
    	for(int i=1; i > 0; i++) {
    		
    		str += num;
    		
    		if(num > 100) {
    			break;
    		}else {
    		num += i;
    		sum +=num;
    		str += " + ";
    		}
    		
    		
    	}//for
    	
    	System.out.printf("%s = %d",str,sum);
    	
 	
	}
}