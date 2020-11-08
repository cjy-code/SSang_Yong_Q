package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q07 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("삽입 위치: ");
		int ins = Integer.parseInt(br.readLine());
		
		System.out.print("값: ");
		int num = Integer.parseInt(br.readLine());
		
		
		
		int[] nums =new int[10];
		
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*10+1);
		}
		
		System.out.print("원본: ");
		System.out.println(Arrays.toString(nums));
		
		int index = 3; 
		int value = 100;
		
		for(int i=nums.length-2; i> ins-2; i--){// 4면 9~6 = 8~5
		
			nums[i+1] = nums[i];
			System.out.println( );		
		}
		
		
		nums[ins-1] = num;
		
		System.out.print("결과: ");
		System.out.println(Arrays.toString(nums));
	
	
	}
}
