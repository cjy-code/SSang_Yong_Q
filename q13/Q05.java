package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("행을 입력: " );
		int row = Integer.parseInt(br.readLine());
		
		System.out.printf("열을 입력: " );
		int column = Integer.parseInt(br.readLine());
		int blank =0;
		int count=1;
		int n=1;
		
		int[][] nums = new int[row][column];
		
		for (int i = 0; i < nums.length; i++) {/////////// 공식 모름 다시 보기 ///////////
			blank = Math.abs(nums.length / 2 - i);
			for (int j = blank; j <= nums.length - 1 - blank; j++) {
				nums[i][j] = n;
				n++;
				
			}
		}
		
		
		for(int i = 0; i<nums.length; i++ ) { 
			for(int j=0; j<nums[0].length; j++) { 
			
				
				System.out.printf("%3d", nums[i][j]);
				if(count== column) {
					System.out.println();
					count=0;
				}
				count++;
				
			}
			
		}
		
	}

}
