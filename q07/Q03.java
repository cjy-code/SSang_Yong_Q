package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
	
	 public static void main(String[] args) throws NumberFormatException, IOException {
	    	
	    	
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = "";
			int count =0;
			int random = ((int)(Math.random() * 10) + 1 );
			
			System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
			System.out.println();
			
	    	for(int i=1; i > 0; i ++) {
				System.out.print("숫자 : ");
				int num = Integer.parseInt(br.readLine());
				count++;
				
				if(num == random) {
					System.out.println("맞췄습니다.\n");
				    break;
				}else{
					System.out.println("틀렸습니다.\n");
					continue;
				}
				
				
				

	    	}//for
	    	
	    	System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n",random);
	    	System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n", count);
	 }//main
}