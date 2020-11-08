package com.test.question.q16;

public class test_random {
	public static void main(String[] args) {
		
//		Color c1 = new Color();
		Macaron m = new Macaron();
		
		
//		for(int i=0; i<100; i++) {
//			int r = (int) (Math.random()*10); //0~9
//			int r2 = (int) (Math.random()*10+1);//1~10
//			
//			
//			System.out.printf("%d ",r);
//			System.out.printf("%d ",r2);
//			
//			System.out.println();
//			}
//		
//		System.out.println(c1.getColor());
//		System.out.println(m.getColor());
//		System.out.println(m.getColor().equals("red"));
		
		System.out.println(m.getThickness());
		
		
	}//main

}

class Color {
	
	private String color;
	private int test;
    int a=0;
	
    public int getTest() {
		for(int i=0; i<10; i++) {
			a++;
		}
		
		return test;
	}

	public void setTest(int test) {
		this.test = test;
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
	
}