package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.print("ù��° ���� : ");
	    int num1 = Integer.parseInt(br.readLine());
	    
	    System.out.print("�ι�° ���� : ");
	    int num2 = Integer.parseInt(br.readLine());
	    
	    if(num1 > num2) {
	    	System.out.printf("ū���� %d�̰�, �������� %d�Դϴ�\n", num1, num2);
	    	System.out.printf("�Է��� �� ���ڴ� %d�� ���̳��ϴ�.",num1-num2);
	    } else if(num1 < num2) {
	    	System.out.printf("ū���� %d�̰�, �������� %d�Դϴ�\n", num2, num1);
	    	System.out.printf("�Է��� �� ���ڴ� %d�� ���̳��ϴ�.",num2-num1);    
	    } else System.out.println("�μ��� �����ϴ�");
		
	}

}
