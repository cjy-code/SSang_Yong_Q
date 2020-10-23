package com.test.question.q03;


public class Q04 {
	public static void main(String[] args)  {
		
	
		
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수","정형돈");
		
		
		
	}//main

	private static void position(String name1, String name2, String name3, String name4) {
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n부장 : %s\n\n", name1, name2, name3,name4);
		
	}

	private static void position(String name1, String name2, String name3) {
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n\n", name1, name2, name3);
		
	}

	private static void position(String name1, String name2) {
		System.out.printf("사원 : %s\n대리 : %s\n\n", name1, name2);
		
	}

	private static void position(String name1) {
		
		System.out.printf("사원 : %s\n\n", name1);
		
	}

}
