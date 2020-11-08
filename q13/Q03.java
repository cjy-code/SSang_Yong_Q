package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("행을 입력: " );
		int row = Integer.parseInt(br.readLine());
		
		System.out.printf("열을 입력: " );
		int column = Integer.parseInt(br.readLine());
		int count=1;
		int n=0;
		
		int[][] nums = new int[row][column];
		
		for(int i = 0; i<nums.length; i++ ) { //행
			for(int j=0; j<nums[0].length; j++) { //열
				n++;
				nums[i][j] = n;
				
				
				
			}
			
		}//for
		
		   
		int a = nums[0].length;
		for(int i =0; i < nums.length; i++ ) { //행
			for(int j= 0; j < nums[0].length; j++) { //열
			
				
				System.out.printf("%3d", nums[j][i]);
				if(count== column) {
					System.out.println();
					count=0;
				}
				count++;
				
			}
			
		}
		
		
		
		
	}
}