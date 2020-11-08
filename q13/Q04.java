package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("행을 입력: " );
		int row = Integer.parseInt(br.readLine());
		
		System.out.printf("열을 입력: " );
		int column = Integer.parseInt(br.readLine());
		int count=1;
		int n=0;
		
		int[][] nums = new int[row][column];
		
		
		   
		int a = nums[0].length;
		for(int i =0; i < nums.length; i++ ) { 
			for(int j= 0; j < a; j++) { 
			    n++;
				nums[i][j] = n;
				System.out.printf("%3d", nums[i][j]);
				if(count== a) {
					System.out.println();
					count=0;
				}
				count++;
				
			}
			a--;
		}
		
		
		
		
	}
}