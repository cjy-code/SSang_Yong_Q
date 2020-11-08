package com.test.question.q17;

public class Q02 {
	
	public static void main(String[] args) {
		
		//시간 1
		TIme t1 = new TIme(); //기본 생성자 호출
		System.out.println(t1.info());

		//시간 2
		TIme t2 = new TIme(2, 30, 45); //오버로딩 생성자 호출
		System.out.println(t2.info());

		//시간 3
		TIme t3 = new TIme(1, 70, 30); //오버로딩 생성자 호출
		System.out.println(t3.info());
   
		//시간 4
		TIme t4 = new TIme(30, 10); //오버로딩 생성자 호출
		System.out.println(t4.info());

		//시간 5
		TIme t5 = new TIme(90, 10); //오버로딩 생성자 호출
		System.out.println(t5.info());

		//시간 6
		TIme t6 = new TIme(50); //오버로딩 생성자 호출
		System.out.println(t6.info());

		//시간 7
		TIme t7 = new TIme(10000); //오버로딩 생성자 호출
		System.out.println(t7.info());
		
	}
	
	

}
