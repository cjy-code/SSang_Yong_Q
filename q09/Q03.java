package com.test.question.q09;

public class Q03 {
	
	public static void main(String[] args) {
		
		int sum;
		
		for(int i=10; i<=100; i+=10) {
			sum =0;
			for(int j=1; j<=i; j++) {
				sum += j;
				
			}
			System.out.printf("1 ~ %d : %d\n",i,sum);
			
		}
	}

}
