package com.test.question.q10;

public class Q02 {
	public static void main(String[] args) {
		
		String email = "hong@gmail.com";
		
		int index = email.indexOf('@');
		System.out.printf("아이디 : %s\n", email.substring(0, index));
		System.out.printf("도메일 : %s\n", email.substring(index+1, email.length()));
		
		
	}

}
