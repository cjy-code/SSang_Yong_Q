package com.test.question.q14;

import java.util.Calendar;

public class Q03 {
	
	public static void main(String[] args) {
		
		
		Bugles snack =new Bugles();//  snack
		snack.setSize(500);
		Calendar c1 = Calendar.getInstance();
		c1.set(2020, 9, 16);
		snack.setCreationTime(c1);
		
		System.out.printf("가격: %,d원\n",snack.getPrice());
		System.out.printf("유통 기한이 %d일 남았습니다\n",snack.getExpiration());
		snack.eat();
		
		System.out.println();
		System.out.println();

		Bugles snack2 =new Bugles();//  snack2
		snack2.setSize(850);
		Calendar c2 = Calendar.getInstance();
		c1.set(2020, 9, 25);
		snack2.setCreationTime(c2);
		
		System.out.printf("가격: %,d원\n",snack2.getPrice());
		System.out.printf("유통 기한이 %d일 남았습니다\n",snack2.getExpiration());
		snack2.eat();
		
		
	}

	

}

class Bugles{
	
	private int price; //가격
	private int weight;// 용량
	private Calendar creationTime ;//제조시간
	private int expiration;//유통기한
	
	
	public int setSize(int i) {
		this.weight = i;
		int a= this.weight;
		
		
		return a;
	}


	public void eat() {
		
		if(this.expiration >= 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		}else
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
	}


	public int getPrice() {
		
		if (this.weight == 300) {
			this.price = 850;
		}else if(this.weight == 500) {
			this.price = 1200;
		}else if(this.weight ==850) {
			this.price = 1950;
		}

		
		
		return this.price;
	}
	
	public void setPrice(int price) {
		
		
		
		this.price = price;
		
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		
		
		this.weight = weight;
	}
	public Calendar getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Calendar creationTime) {
		
		
		this.creationTime = creationTime;
	}
	
	public int getExpiration() {  //먹을 수 있는 날짜 = 유통기간 - 현재 - 제조시간
		
		int date =0;
		if(this.weight==300) {//date = 유통기간
			date= 7;
		}else if(this.weight==500) {
			date = 10;
		}else if(this.weight==850) {
			date = 15;
		}
		
		Calendar now = Calendar.getInstance();// 현재시간
		long now_Date = now.getTimeInMillis() /(1000*60*60*24);// 현재 일수
		long creation_Date = this.creationTime.getTimeInMillis() /(1000*60*60*24); //생산 일수
		
		 this.expiration = (int) (date+creation_Date -now_Date );
		
		return this.expiration;
	}
	public void setExpiration(int expiration) {
		this.expiration = expiration;
	}
	
	
	
	
	
	
}