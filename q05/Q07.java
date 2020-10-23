package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q07 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("[������ �ð�]");
	    System.out.print("�� : ");
	    int in_Hour = Integer.parseInt(br.readLine());
	    System.out.print("�� : ");
	    int in_Min = Integer.parseInt(br.readLine());
	    
	    System.out.println("[������ �ð�]");
	    System.out.print("�� : ");
	    int out_Hour = Integer.parseInt(br.readLine());
	    System.out.print("�� : ");
	    int out_Min = Integer.parseInt(br.readLine());
	    
	    parking_fare(in_Hour,in_Min,out_Hour,out_Min);
	    parking_fare_Caledar(in_Hour,in_Min,out_Hour,out_Min);
	
	
	}//main

	private static void parking_fare_Caledar(int in_Hour, int in_Min, int out_Hour, int out_Min) {
		
	    System.out.println();
	    System.out.println("--------------------------- Ķ���� ���� ----------------------------");
		Calendar in_Time = Calendar.getInstance();
		Calendar out_Time = Calendar.getInstance();
				 
		in_Time.set(0, 0, 0, in_Hour, in_Min);
		out_Time.set(0, 0, 0, out_Hour, out_Min);
		
		int fare = (out_Time.get(Calendar.HOUR_OF_DAY)*60+out_Time.get(Calendar.MINUTE))-
				   (in_Time.get(Calendar.HOUR_OF_DAY)*60+in_Time.get(Calendar.MINUTE));
		
		if (fare > 30) {

			System.out.printf("���� ����� %,d���Դϴ�.\n", (fare - 30) / 10 * 2000);
		} else
			System.out.println("�����Դϴ�.\n");
		
		System.out.println("--------------------------------------------------------------------");
		
		
		
		
		
	}

	private static void parking_fare(int in_Hour, int in_Min, int out_Hour, int out_Min) {
		
		System.out.println();
		System.out.println("--------------------------- �Ϲ� ���� ------------------------------");
		
		int in_Time = (in_Hour*60) + in_Min;
		int out_Time = (out_Hour*60) + out_Min;
		
		if((out_Time-in_Time) > 30) {
			
			System.out.printf("���� ����� %,d���Դϴ�.\n", (out_Time-in_Time-30)/10*2000 );
		} else System.out.println("�����Դϴ�.\n");
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
		
	}

}
