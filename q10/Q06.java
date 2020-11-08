package com.test.question.q10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {
	
	public static void main(String[] args) {

		String txt = "   하나   둘   셋   넷   ";
		System.out.printf("원본문자: \"%s\"\n",txt);
		int count=0, count2=0;
		String str ="", str2="";
		
		for(int i=0; i<txt.length(); i++) {
			char c = txt.charAt(i);
			if(c != ' ') {
				break;
			}
			count++;
		}
		for(int i=txt.length(); i>0; i--) {
			char c = txt.charAt(i-1);
			if(c != ' ') {
				break;
			}
			count2++;
		}
		str = txt.replace(" ", "");
				
		
		for(int i=0; i<count; i++) {
			str2 += " ";
		}
		str2+=str;
		for(int i=0; i<count2; i++) {
			str2 += " ";
		}
		
		System.out.printf("결과문자: \"%s\"\n",str2);
		
		
		
	}

}
