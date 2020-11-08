package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String txt ="안녕안녕하하하하하하하세요...홍홍홍홍홍길동입입니다다다다.";
		System.out.println("원본: "+txt);
		int count =0;
		int index = -1;
		for(int i=0; i<txt.length(); i++) {
			
			
			index = txt.indexOf("안", index);
			
			if(index == -1) break;
			char c = txt.charAt(index);
			char c2 = '안';
			if(c ==c2) {
				count++;
				index += "안".length();
			}
			
		}
		System.out.printf("'안':발견횟수 %d회\n", count);
		
		count =0;
		index = -1;
		for(int i=0; i<txt.length(); i++) {
			
			
			index = txt.indexOf("녕", index);
			
			if(index == -1) break;
			char c = txt.charAt(index);
			char c2 = '녕';
			if(c ==c2) {
				count++;
				index += "녕".length();
			}
			
		}
		System.out.printf("'녕':발견횟수 %d회\n", count);
			
		count =0;
		index = -1;
		for(int i=0; i<txt.length(); i++) {
			
			
			index = txt.indexOf("하", index);
			
			if(index == -1) break;
			char c = txt.charAt(index);
			char c2 = '하';
			if(c ==c2) {
				count++;
				index += "하".length();
			}
			
		}
		System.out.printf("'안':발견횟수 %d회\n", count);
		
		count =0;
		index = -1;
		for(int i=0; i<txt.length(); i++) {
			
			
			index = txt.indexOf("세", index);
			
			if(index == -1) break;
			char c = txt.charAt(index);
			char c2 = '세';
			if(c ==c2) {
				count++;
				index += "세".length();
			}
			
		}
		System.out.printf("'세':발견횟수 %d회\n", count);
		
		count =0;
		index = -1;
		for(int i=0; i<txt.length(); i++) {
			
			
			index = txt.indexOf("요", index);
			
			if(index == -1) break;
			char c = txt.charAt(index);
			char c2 = '요';
			if(c ==c2) {
				count++;
				index += "요".length();
			}
			
		}
		System.out.printf("'요':발견횟수 %d회\n", count);
		
		count =0;
		index = -1;
		for(int i=0; i<txt.length(); i++) {
			
			
			index = txt.indexOf("홍", index);
			
			if(index == -1) break;
			char c = txt.charAt(index);
			char c2 = '홍';
			if(c ==c2) {
				count++;
				index += "홍".length();
			}
			
		}
		System.out.printf("'홍':발견횟수 %d회\n", count);
		
		count =0;
		index = -1;
		for(int i=0; i<txt.length(); i++) {
			
			
			index = txt.indexOf("길", index);
			
			if(index == -1) break;
			char c = txt.charAt(index);
			char c2 = '길';
			if(c ==c2) {
				count++;
				index += "길".length();
			}
			
		}
		System.out.printf("'길':발견횟수 %d회\n", count);
		
		count =0;
		index = -1;
		for(int i=0; i<txt.length(); i++) {
			
			
			index = txt.indexOf("동", index);
			
			if(index == -1) break;
			char c = txt.charAt(index);
			char c2 = '동';
			if(c ==c2) {
				count++;
				index += "동".length();
			}
			
		}
		System.out.printf("'동':발견횟수 %d회\n", count);
	
		count =0;
		index = -1;
		for(int i=0; i<txt.length(); i++) {
			
			
			index = txt.indexOf("입", index);
			
			if(index == -1) break;
			char c = txt.charAt(index);
			char c2 = '입';
			if(c ==c2) {
				count++;
				index += "입".length();
			}
			
		}
		System.out.printf("'입':발견횟수 %d회\n", count);
		
		count =0;
		index = -1;
		for(int i=0; i<txt.length(); i++) {
			
			
			index = txt.indexOf("니", index);
			
			if(index == -1) break;
			char c = txt.charAt(index);
			char c2 = '니';
			if(c ==c2) {
				count++;
				index += "니".length();
			}
			
		}
		System.out.printf("'니':발견횟수 %d회\n", count);
		
		count =0;
		index = -1;
		for(int i=0; i<txt.length(); i++) {
			
			
			index = txt.indexOf("다", index);
			
			if(index == -1) break;
			char c = txt.charAt(index);
			char c2 = '다';
			if(c ==c2) {
				count++;
				index += "다".length();
			}
			
		}
		System.out.printf("'다':발견횟수 %d회\n", count);
		
		count =0;
		index = -1;
		for(int i=0; i<txt.length(); i++) {
			
			
			index = txt.indexOf(".", index);
			
			if(index == -1) break;
			char c = txt.charAt(index);
			char c2 = '.';
			if(c ==c2) {
				count++;
				index += ".".length();
			}
			
		}
		System.out.printf("'.':발견횟수 %d회\n", count);
		
		
		
	
}
}