package com.test.question.q08;

public class Q04 {
	
	public static void main(String[] args) {

		for(int i = 0 ; i < 5; i ++)		
		{
			for(int j = 5; j > i+1 ; j --)	
			{
				System.out.print(" ");
			}
			
			for(int k = 0; k < i+1; k ++)	
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
}