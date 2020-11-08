package com.test.question.q11;

public class Q05 {
	
	public static void main(String[] args) {
		
		int count = (int) (Math.random()*20+1);
		int[] nums =new int[count];
		int max=0,min=21;
		String str = "";
		
		
		for(int i=0; i<count; i++) {//난수 만들기
			nums[i] = (int) (Math.random()*20+1);
			str += nums[i];
			if(i < count-1) {
				str += ",";
			}
		}
		System.out.printf("원본 : %s \n", str);
		
		for(int i=0; i<nums.length; i++) {
			
			if(max<nums[i]) {
				max = nums[i];
			} else if(min>nums[i]) {
				min = nums[i];
			}
			
		}
		
		System.out.printf("최대값 : %d\n", max);
		System.out.printf("최소값 : %d\n", min);
	
	
	
	
	
	
	
	
	}

}
