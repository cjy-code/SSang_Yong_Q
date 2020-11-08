package com.test.question.q10;

public class Q01 {
	public static void main(String[] args) {
		
		String txt = "안녕하세요. 홍길동입니다.";
		String result = "";
		for(int i=txt.length()-1; i>=0; i--) {
			
			result += txt.charAt(i);
		}
		System.out.print(result);
	}

}
