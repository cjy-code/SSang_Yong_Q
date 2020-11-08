package com.test.question.q10;

public class Q08 {
	
	public static void main(String[] args) {
		
		String txt ="안녕~ 길동아~ 잘가~ 길동아";
		int count =0;
		int index = -1;
		
		while(true) {
			index = txt.indexOf("길동",index);
		
			
			if(index == -1) {
				break;
			}
			
			index +="길동".length();
			count++;
		}
		System.out.printf("\"길동\"을 총 %d회 발견했습니다.\n",count);

		
		
	}

}
