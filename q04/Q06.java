package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q06 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("������ �ޱ� ���ϴ� �ð�");
		System.out.print("�� : ");
		int hour = Integer.parseInt(br.readLine());
		System.out.print("�� : ");
		int min = Integer.parseInt(br.readLine());
		
		Calendar now = Calendar.getInstance();
		now.set(0, 0, 0, hour, min, 0);
		
		now.add(Calendar.MINUTE, -10);
		System.out.printf("¥��� : %d�� %d��\n", now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
		now.add(Calendar.MINUTE, -8);
		System.out.printf("ġŲ : %d�� %d��\n", now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
		now.add(Calendar.MINUTE, -7);
		System.out.printf("���� : %d�� %d��\n", now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
		
			

		
		
		
	}

}
