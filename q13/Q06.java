package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("행을 입력: " );
		int row = Integer.parseInt(br.readLine());
		
		System.out.printf("열을 입력: " );
		int column = Integer.parseInt(br.readLine());
		
		int count=1;
		int n=0;
		int r_Sum=0, c_Sum=0;
		int rr_Sum=0, cc_Sum=0;// 행과 열들의 합
		
		int[][] nums = new int[row][column];
		
		for(int i = 0; i<nums.length-1; i++ ) { // 4,4 까지 
			for(int j=0; j<nums[0].length-1; j++) { 
				n++;
				nums[i][j] = n;
			}
			
		}//for
		
		for(int i = 0; i<nums.length; i++ ) {   //행의합
			for(int j=0; j<nums[0].length; j++) { 
				
				r_Sum += nums[i][j];
				if(j==nums[0].length-1) {
					nums[i][nums[0].length-1] = r_Sum;
					rr_Sum += r_Sum;
					r_Sum=0;
				}
				
			}
			
		}//for
		
		
		for(int i =0; i < nums.length; i++ ) { //열의합
			for(int j= 0; j < nums[0].length; j++) { 
				
				c_Sum += nums[j][i];
				if(j==nums[0].length-1) {
					nums[nums[0].length-1][i] = c_Sum;
					cc_Sum +=c_Sum;
					c_Sum = 0;
				}
				
			}
			
		}//for
		
	
		
		for(int i = 0; i<nums.length; i++ ) { //출력
			for(int j=0; j<nums[0].length; j++) { 
			
				
				System.out.printf("%3d", nums[i][j]);
				if(count== column) {
					System.out.println();
					count=0;
				}
				count++;
				
			}
			
		}
		
		
	}//main

}
