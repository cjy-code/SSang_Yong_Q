package com.test.question.q14;

public class Q02 {
	
	
	public static void main(String[] args) {
		
		Note n1 = new Note();
		n1.setSize("B4");
		n1.setColor("검정색");
		n1.setPage(30);
		n1.setName("홍길동");
		System.out.println(n1.info(n1));
		
		
		
		Note n2 = new Note();
		n2.setSize("A4");
		n2.setColor("흰색");
		n2.setPage(120);
		
		System.out.println(n2.info(n2));
		
		
	}

	

}

class Note{
	
	private String size;//쓰기 전용
	private String color;
	private String Name;//쓰기 전용
	private String pubYear = "2020";
	private int page;// 쓰기전용
	
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String info(Note n1) {
		String temp = "";
		String thick =""; // 페이지 두께
		int price = 0;
		
		if(this.page>=10&& this.page<=50) {
			thick = "얇다";
		}else if(this.page>=51 && this.page<= 100) {
			thick = "보통";
		}else {
			thick = "두껍다";
		}
		
		if(this.size.equals("A3")) { // 사이즈 가격
			price += 0;
		}else if(this.size.equals("A3")) {
			price += 400;
		}else if(this.size.equals("A4")){
			price += 200;
		}else if(this.size.equals("B3")){
			price += 500;
		}else if(this.size.equals("B4")){
			price += 300;
		}else if(this.size.equals("B5")){
			price += 100;
		}else {
			System.out.println("사이즈가 틀렸습니다.");
		}
		
		if(this.color.equals("흰색")) { // 색 가격
			price +=0; 
		}else if(this.color.equals("검정색")){
			price +=100;
		}else if(this.color.equals("노란색")){
			price +=200;
		}else if(this.color.equals("파란색")){
			price +=200;
		}
		
		if(this.getPage()>10) {
			price += (this.getPage()-10)*10;
		}
		
	    temp += "■ ■ ■ ■ ■ 노트 정보 ■ ■ ■ ■ ■\n";
	    temp += "소유자 : " + this.Name+"\n";
	    temp += "특성 : " + this.color +" "+ thick +" "+ this.size+"\n";
	    temp += temp.format("가격 : %,d원\n", price);
		temp += "■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■\n";
		
		if(this.Name==null) { // 이름이 없다면 
			temp ="";
			temp += "■ ■ ■ ■ ■ 노트 정보 ■ ■ ■ ■ ■\n";
			temp += "     주인 없는 노트\n";
			temp += "■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■\n";
		}
		return temp;
	}

	public String getSize() {
		return size;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		
		if(color.equals("검정색") || color.equals("흰색") || color.equals("노란색") || color.equals("파란색")) {
			this.color = color;
		}else {
			this.color ="검정, 흰색, 노란색, 파란색 중에 선택해 주세요";
		}
	}


	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	
	
	
	
	
	
	
}
