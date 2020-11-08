package com.test.question.q17;

public class Student {
	
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	
	public Student() {
		this.name = "미정";
	}
	
	public Student(String name, int age, int grade, int classNumber, int number) {
		this.name = name;
		this.age = age; 
		this.grade = grade;
		this.classNumber = classNumber;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age; 
		
	}
	
	public Student(int grade, int classNuber, int number) {
		this.name = "미정";
		this.number =number;
		this.grade = grade;
		this.classNumber = classNumber;
	}
	
	public String info() {
		
	 return String.format("%s(나이 : %s, 학년 : %s, 반 : %s, 번호 : %s)"
				, this.name
				, this.age != 0 ? this.age + "세" : "미정"
				, this.grade != 0 ? this.grade : "미정"
				, this.classNumber != 0 ? this.grade : "미정"
				, this.number != 0 ? this.grade : "미정");
	
	
	}
	
}
