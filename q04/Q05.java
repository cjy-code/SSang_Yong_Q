package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�ƺ� ����(��) : ");
		int f_Y=Integer.parseInt(br.readLine());
		System.out.print("�ƺ� ����(��) : ");
		int f_M=Integer.parseInt(br.readLine());
		System.out.print("�ƺ� ����(��) : ");
		int f_D=Integer.parseInt(br.readLine());
		
		
		System.out.print("�� ����(��) : ");
		int d_Y=Integer.parseInt(br.readLine());
		System.out.print("�� ����(��) : ");
		int d_M=Integer.parseInt(br.readLine());
		System.out.print("�� ����(��) : ");
		int d_D=Integer.parseInt(br.readLine());
		
		
		
		Calendar father = Calendar.getInstance();
        Calendar daughter = Calendar.getInstance();
        
        father.set(f_Y, f_M-1, f_D);
        daughter.set(d_Y, d_M-1, d_D);
		System.out.printf("�ƺ� ���� %tF\n", father);
        
		long fatherTick = father.getTimeInMillis();
		long daughterTick = daughter.getTimeInMillis();
		
		
		long gap = daughterTick -  fatherTick;
		
		
		System.out.printf("�ƺ��� ������ �� %,d",gap / 1000 / 60 / 60 / 24);
		
		
		
		
	}

}
