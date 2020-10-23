package com.test.question.q03;

public class Q03 {
	
	public static void main(String[] args)   {
				
		sum(10);
		sum(10,20);
		sum(10,20,30);
	}

	public static void sum(int i, int j, int k) {
		System.out.printf("%d + %d + %d = %d\n",i,j,k, i+j+k);
		
	}

	public static void sum(int i, int j) {
		System.out.printf("%d + %d = %d\n",i,j,i+j);
		
	}

	public static void sum(int i) {
        
		System.out.printf("%d = %d\n",i,i);
		
	}

}
