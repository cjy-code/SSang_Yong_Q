package com.test.question.q03;


public class Q04 {
	public static void main(String[] args)  {
		
	
		
		position("ȫ�浿");
		position("ȫ�浿", "���缮");
		position("ȫ�浿", "���缮", "�ڸ��");
		position("ȫ�浿", "���缮", "�ڸ��","������");
		
		
		
	}//main

	private static void position(String name1, String name2, String name3, String name4) {
		System.out.printf("��� : %s\n�븮 : %s\n���� : %s\n���� : %s\n\n", name1, name2, name3,name4);
		
	}

	private static void position(String name1, String name2, String name3) {
		System.out.printf("��� : %s\n�븮 : %s\n���� : %s\n\n", name1, name2, name3);
		
	}

	private static void position(String name1, String name2) {
		System.out.printf("��� : %s\n�븮 : %s\n\n", name1, name2);
		
	}

	private static void position(String name1) {
		
		System.out.printf("��� : %s\n\n", name1);
		
	}

}
