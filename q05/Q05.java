package com.test.question.q05;


import java.io.IOException;


public class Q05 {
	
public static void main(String[] args) throws IOException  {
		
		
		System.out.print("���� : ");
		int input = System.in.read();
		
		

		if(input >=65 && input <=90) {
			System.out.printf("��� : %c", input+32);
		} else System.out.printf("��� : %c", input-32);
	
  }
}
