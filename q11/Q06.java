package com.test.question.q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("최대범위: ");
		int max = Integer.parseInt(br.readLine());
		
		System.out.print("최소범위: ");
		int min = Integer.parseInt(br.readLine());
		
		int[] nums = new int[20];
		String str = "";
		
		for(int i=0; i<20; i++) {
			
			nums[i] = (int) (Math.random()*20+1);
			str+= nums[i];
			
			if(i < 19) {
				str += ", ";
			}
			
		}//for
		System.out.printf("원본: %s\n", str);
		
		str = "";// str 초귀환
		for(int i=0; i<20; i++) {
			
			if(nums[i]>=min && nums[i]<=max) {
			str+= nums[i];
				if(i < 19) {
					str += ", ";
				}
			}
		}//for
		System.out.printf("결과: %s", str);
		
	}

}
