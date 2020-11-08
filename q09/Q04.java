package com.test.question.q09;

public class Q04 {
	
	public static void main(String[] args) {
		
        int sum;
		int a = 1;
		int b = 0;
		for(int i=1; i<=10; i++) {
			sum =0;
			for(int j=a; j<=i*10; j++) {
			    b=j; 
				sum += j;
					
			}
		    a +=10;
			System.out.printf("%d ~ %d : %d\n",a-10,b,sum);	

			
		}
	}

}
