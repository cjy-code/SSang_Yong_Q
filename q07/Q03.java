package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
	
	 public static void main(String[] args) throws NumberFormatException, IOException {
	    	
	    	
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = "";
			int count =0;
			int random = ((int)(Math.random() * 10) + 1 );
			
			System.out.println("��ǻ�Ͱ� 1~10 ������ ���ڸ� 1�� �����߽��ϴ�.");
			System.out.println();
			
	    	for(int i=1; i > 0; i ++) {
				System.out.print("���� : ");
				int num = Integer.parseInt(br.readLine());
				count++;
				
				if(num == random) {
					System.out.println("������ϴ�.\n");
				    break;
				}else{
					System.out.println("Ʋ�Ƚ��ϴ�.\n");
					continue;
				}
				
				
				

	    	}//for
	    	
	    	System.out.printf("��ǻ�Ͱ� ������ ���ڴ� %d�Դϴ�.\n",random);
	    	System.out.printf("������ ���ߴµ� �õ��� Ƚ���� %dȸ�Դϴ�.\n", count);
	 }//main
}