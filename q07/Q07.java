package com.test.question.q07;

public class Q07 {

	public static void main(String[] args)  {
    	
		int num = 1;
		int sum = 1;
		int temp = 0;
		String str = "";
		
	    	for(int i=1; i > 0; i++) {
	    		str +=""+ num;
	    		
	    		if(num > 100) {
	    			break;
	    		}else {
	    			if(i==1) {
	    				str += "+"+ sum + "+";
	    				sum += num;
	    				temp = num;
	    				
	    				num = sum;
	    			} else{
	    			str += "+";
	    			sum += temp;
	    			temp = num;
	    			num = sum;
	    			
	    			}
	    		}
	    	}//for
	    	System.out.printf("%s = %d",str,sum);
	}
}