package com.test.question.q08;

public class Q02 {
	
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j=5; j>=1; j-=1) {
				if(j == count) {
					break;
				}
				System.out.printf("i: %d, j: %d\n",i,j);
				
			}//for(i)
			count++;
		}//for(j)
		
	}//main

}
