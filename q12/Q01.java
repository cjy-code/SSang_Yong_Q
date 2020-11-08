package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int index_B = -1 , index_M= -1;
		int temp_B = -2, temp_M = -1;
		int count = 0;
		
		while (true) {//바보

			index_B = str.indexOf("바보", index_B);
			
			if (temp_B <= index_B) {
				
				count++;
			}
			
			if (index_B == -1) {
				break;
			}

			//System.out.printf("%d번째 발견\n", index);

			index_B += "바보".length();
			temp_B= index_B;
		}
		
		while (true) {//멍청이

			index_M = str.indexOf("멍청이", index_M);
			
			if (temp_M < index_M) {
				
				count++;
			}
			
			if (index_M == -1) {
				break;
			}

			//System.out.printf("%d번째 발견\n", index);

			index_M += "멍청이".length();
			temp_M= index_M;
		}
		
		str = str.replace("바보", "**");
		str = str.replace("멍청이", "***");
		
		
		System.out.println(str);
		System.out.printf("금지어를 %d회 마스킹했습니다.", count);

	}
	}