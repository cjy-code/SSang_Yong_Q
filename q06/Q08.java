package com.test.question.q06;


public class Q08 {
	
	public static void main(String[] args)  {
		
		
		int sum =0;
		
		for(int i=1; i > 0; i++) { 
			sum += i;
			System.out.printf("%d",i);
			if(sum > 1000) {
				break;
			}
			System.out.print(" + ");
			
		}//for
		System.out.printf("= %d",sum);
	}

}
