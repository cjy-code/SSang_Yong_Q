package com.test.question.q03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� ���� : ");
		int station = Integer.parseInt(br.readLine());
		System.out.print("ȯ�¿��� Ƚ�� : ");
		int trans = Integer.parseInt(br.readLine());
		System.out.print("�ð��븦 �Է��Ͻÿ� : ");
		String time = br.readLine();
		
		System.out.printf("�� �ҿ� �ð��� %d�� �Դϴ�.",getTime(station, trans, time));
		

	}//main
	
	public static int getTime(int station, int trans,String time) {
	
	   int Time = time.equals("���") ? 5 :
		          time.equals("���") ? 4 : 3;
		
		return station*2+trans*Time;
		
	}

}
