package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q08 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("삭제 위치: ");
		int del = Integer.parseInt(br.readLine());
		int[] nums =new int[5];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*10+1);
		}
		System.out.print("원본: ");
		System.out.println(Arrays.toString(nums));
		int index = 1;
		
		for(int i=del; i<nums.length; i++) {
			nums[i-1] = nums[i];
		}
		
		nums[nums.length-1]=0;
		System.out.print("결과: ");
		System.out.println(Arrays.toString(nums));
		
		
	}

}
