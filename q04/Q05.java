package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("아빠 생일(년) : ");
		int f_Y=Integer.parseInt(br.readLine());
		System.out.print("아빠 생일(월) : ");
		int f_M=Integer.parseInt(br.readLine());
		System.out.print("아빠 생일(일) : ");
		int f_D=Integer.parseInt(br.readLine());
		
		
		System.out.print("딸 생일(년) : ");
		int d_Y=Integer.parseInt(br.readLine());
		System.out.print("딸 생일(월) : ");
		int d_M=Integer.parseInt(br.readLine());
		System.out.print("딸 생일(일) : ");
		int d_D=Integer.parseInt(br.readLine());
		
		
		
		Calendar father = Calendar.getInstance();
        Calendar daughter = Calendar.getInstance();
        
        father.set(f_Y, f_M-1, f_D);
        daughter.set(d_Y, d_M-1, d_D);
		System.out.printf("아빠 생일 %tF\n", father);
        
		long fatherTick = father.getTimeInMillis();
		long daughterTick = daughter.getTimeInMillis();
		
		
		long gap = daughterTick -  fatherTick;
		
		
		System.out.printf("아빠는 딸보다 총 %,d",gap / 1000 / 60 / 60 / 24);
		
		
		
		
	}

}
