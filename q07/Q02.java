package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		
		
		
		for(int i=1; i <= 10; i ++) {
			System.out.print("¼ýÀÚ : ");
			int num = Integer.parseInt(br.readLine());
			
			switch (num) {
			case 1:
				str += "ÀÏ";
				break;
			case 2:
				str += "ÀÌ";
				break;
			case 3:
				str += "»ï";
				break;
			case 4:
				str += "»ç";
				break;
			case 5:
				str += "¿À";
				break;
			case 6:
				str += "À°";
				break;
			case 7:
				str += "Ä¥";
				break;
			case 8:
				str += "ÆÈ";
				break;
			case 9:
				str += "±¸";
				break;
			default:
				str += "¿µ";
				break;
			}
			
		}//for
            System.out.printf("°á°ú: %s", str);
  }
}
