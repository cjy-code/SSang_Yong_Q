package com.test.question.q07;

public class Q08 {
	
	public static void main(String[] args) {
		
		String str = "";	
		
		for(int num= 2; num<= 100; num++) {
			
			for(int j =2; j <=num; j++) {
				
				if(num != j && num % j ==0)break;
				if(num == j) {
					str += num;
					str += ", ";
					
					
				}
				
			}//for(j)
			
		}///for(i)
			
		System.out.println(str);
		
	}

}
