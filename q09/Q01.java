package com.test.question.q09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("행의 갯수를 입력하세요: ");
		int line = Integer.parseInt(br.readLine());
		char chat = 97;
		
		
		for(int i = 1 ; i <= line; i ++){
			
			for(int j = 1; j <= line-i ; j++){
				System.out.print(" ");
			}
			
			for(int left = 0; left<i; left++){
				if(left==0) {
					System.out.print(chat);
				}else {
				chat+=1;
				System.out.printf("%c",chat);
				}
			}
			for(int right =0; right<i; right++) {
				if(right==0) {
					System.out.print(chat);
				}else {
				chat-=1;
				System.out.printf("%c",chat);
				}
			
			}
			
			System.out.println();
			
		}
	}
	}