package com.test.question.q09;

public class Q02 {
	
	public static void main(String[] args) {
		
		for(int i=1; i <= 9; i++) {//2번째 수
			for(int j=2; j<=5; j++) {//단
				System.out.printf("%d X %d = %d	",j,i,j*i);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1; i <= 9; i++) {//2번째 수
			for(int j=6; j<=9; j++) {//단
				System.out.printf("%d X %d = %d	",j,i,j*i);
			}
			System.out.println();
		}
	}

}
