package com.test.question.q16;

public class Macaron {
	
	private int size;
	private int thickness;
	private String color;
	
	
	public int getSize() {
		size = (int) (Math.random() * 15 + 1); // 1~15개의 랜덤한 수

		if (size >= 5 && size <= 15) { // 5~ 15cm 반환
			this.size = size;
		}

		return size;
	}
	public void setSize(int size) {
		
		
		this.size = size;
	}

	
	public String getColor() {
		
		String[] M_color = {"red", "blue", "yellow", "white", "pink","purple","green","black"};
		int a = (int) (Math.random() * 8);
		color = M_color[a];
		
		return color;
	}
	public void setColor(String color) {
		
			this.color = color;
	}
	
	
	public int getThickness() {// 샌드 두깨
		
		thickness = (int) (Math.random() * 20 + 1); //생산 샌드 두깨 1~20

		if (size >= 3 && size <= 18) { // 5~ 15cm
			this.thickness = thickness;
		}
		return thickness;
	}

	public void setThickness(int thickness) {

		
		this.thickness = thickness;
	}

}
