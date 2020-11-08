package com.test.question.q13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08_ {

	public static void main(String[] args) throws Exception{
		//https://m.blog.naver.com/PostView.nhn?blogId=javaking75&logNo=140186427338&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행 : ");
		int n1= Integer.parseInt(reader.readLine());
		System.out.print("열 : ");
		int n2= Integer.parseInt(reader.readLine());
		int[][] nums = new int[n1][n2];
		
		int n =1;
		
		if(n1>=n2) {
	        for(int i=0; i<2*nums.length-1; i++ ){  //0~8 : 9회전 : 대각선
	            for(int row=0; row< nums.length; row++){ //0~4 : 5회전 : 행
	               
	                int col=i-row; //열                
	                if(col>=0&&col<nums[0].length){ //0보다 크거나 같고 5보다 작은 경우에
	                	nums[row][col] = n;
	                	n++;
	                	
	                    
	                }
	                
	            }          
	        }
		} 
	}
}