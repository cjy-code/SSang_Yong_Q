//package com.test.question.q14;
//
//public class Q02_ {
//	
//	public static void main(String[] args) {
//		
//		Note_ n1 = new Note_();
//		n1.setSize("B4");
//		n1.setColor("검정색");
//		n1.setPage(30);
//		n1.setName("홍길동");
//		System.out.println(info(n1));
//		
//		
//		Note_ n2 = new Note_();
//		n2.setSize("B4");
//		n2.setColor("검정색");
//		n2.setPage(30);
//		n2.setName("홍길동");
//		System.out.println(n2.info());
//		
//	}
//
//	private static String info(Note_ n1) {
//		
//		String temp = "";
//		String thick =""; // 페이지 두께
//		int price = 0;
//		
//		if(this.getPage()>=10&& this.getPage()<=50) {
//			thick = "얇다";
//		}else if(this.getPage()>=51 && this.getPage()<= 100) {
//			thick = "보통";
//		}else {
//			thick = "두껍다";
//		}
//		
//		return null;
//	}
//
//	
//
//}
//class Note_{
//	
//	private String size;//쓰기 전용
//	private String color;
//	private String Name;//쓰기 전용
//	private String pubYear = "2020";
//	private int page;// 쓰기전용
//	
//	public void setSize(String size) {
//		this.size = size;
//	}
//	
//	public char[] info() {
//		
//		
//		
//		return null;
//	}
//
//	public String getSize() {
//		return size;
//	}
//
//
//	public String getColor() {
//		return color;
//	}
//
//
//	public void setColor(String color) {
//		
//		if(color.equals("검정색") || color.equals("흰색") || color.equals("노란색") || color.equals("파란색")) {
//			this.color = color;
//		}else {
//			this.color ="검정, 흰색, 노란색, 파란색 중에 선택해 주세요";
//		}
//	}
//
//
//	public int getPage() {
//		return page;
//	}
//
//
//	public void setPage(int page) {
//		this.page = page;
//	}
//
//
//	public String getName() {
//		return Name;
//	}
//
//
//	public void setName(String name) {
//		Name = name;
//	}
//	
//}