package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09_ {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("행을 입력: \n" );
		int row = 5;
		
		System.out.printf("열을 입력: \n" );
		int column = 5;
		
		int n = 0;
		int s = 0;
		int count = 0;
		int[][] nums = new int[row][column];
		
		for(int i = 0; i<nums.length; i++ ) { // 4,4 까지 
			for(int j=0; j<nums[0].length-count; j++) { 
				n++;
				s++;
				nums[i][j] = n;
				if(j==nums[0].length) {
					for(int k=0; k<nums.length; k++) {
						
						nums[k][j] =n;
						n++;
					}
				}
				
			}
		}//for
		
		
	}//main

}
