package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
		
    	for(int i=1; i > 0; i ++) {
    		System.out.println("=======================");
    		System.out.println("    ���Ǳ�");
    		System.out.println("=======================");
    		System.out.println("1. �ݶ�		:700��");
    		System.out.println("2. ���̴�	:600��");
    		System.out.println("1. ��Ÿ��500	:500��");
    		System.out.println("-----------------------");
    		System.out.print("�ݾ� ����(��) : ");
            int input = Integer.parseInt(br.readLine());
            System.out.println("-----------------------");
    		System.out.print("���ἱ��(��ȣ) : ");
    		int num = Integer.parseInt(br.readLine());
            int change =0;
    		
    		
    		if(num == 1) {
            	change = input - 700;
            	System.out.println("+�ݶ� �����մϴ�.");
            	System.out.printf("�ܵ� %,d���� �����մϴ�\n",change);
            }else if(num == 2) {
            	change = input - 600;
            	System.out.println("+���̴ٸ� �����մϴ�.");
            	System.out.printf("+�ܵ� %,d���� �����մϴ�\n",change);
            }else if(num == 3) {
            	change = input - 500;
            	System.out.println("+��Ÿ��500�� �����մϴ�.");
            	System.out.printf("+�ܵ� %,d���� �����մϴ�\n",change);
            }
    		System.out.println();
    		System.out.println("����Ͻ÷��� ���͸� �Է��ϼ���");
    		String enter = br.readLine();
    		if(enter.equals("")){
    			continue;
    		}else { break;}
    		
    	}
	}
}
