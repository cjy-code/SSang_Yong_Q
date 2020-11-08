package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q06_ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 범위: ");
		int range = Integer.parseInt(br.readLine());
		
		System.out.print("숫자 개수: ");
		int num = Integer.parseInt(br.readLine());
		
		int[] nums = new int[num];

		for (int i = 0; i < nums.length; i++) {

			int n = (int) (Math.random() * range) + 1;
			nums[i] = n;
						for (int j = 0; j < i; j++) {
				if (n == nums[j]) {
					
					i--; 
					break;
				}
			}

		} 

		
		System.out.println();
		System.out.println(Arrays.toString(nums));

	} 
	private static void output(int[] nums) {

		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("[%d] = %d\n", i, nums[i]);
		}

	}

}
