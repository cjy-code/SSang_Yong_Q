package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		
		
		
		for(int i=1; i <= 10; i ++) {
			System.out.print("���� : ");
			int num = Integer.parseInt(br.readLine());
			
			switch (num) {
			case 1:
				str += "��";
				break;
			case 2:
				str += "��";
				break;
			case 3:
				str += "��";
				break;
			case 4:
				str += "��";
				break;
			case 5:
				str += "��";
				break;
			case 6:
				str += "��";
				break;
			case 7:
				str += "ĥ";
				break;
			case 8:
				str += "��";
				break;
			case 9:
				str += "��";
				break;
			default:
				str += "��";
				break;
			}
			
		}//for
            System.out.printf("���: %s", str);
  }
}
