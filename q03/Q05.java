package com.test.question.q03;

public class Q05 {
	public static void main(String[] args) {
	

		int count = positive(10);
		System.out.printf("양수 : %d개\n",count);
		count = positive(10,20);
		System.out.printf("양수 : %d개\n",count);
		count = positive(10,20,-30);
		System.out.printf("양수 : %d개\n",count);
		count = positive(10,20,-30,40);
		System.out.printf("양수 : %d개\n",count);
		count = positive(10,20,-30,40,50);
		System.out.printf("양수 : %d개\n",count);
		
		

		
	}//main


	private static int positive(int i, int j, int k, int l, int m) {
		int count =0;
		count = i > 0 ? ++count : count;
		count = j > 0 ? ++count : count;
		count = k > 0 ? ++count : count;
		count = l > 0 ? ++count : count;
		count = m > 0 ? ++count : count;
			
		return count;
	}

	private static int positive(int i, int j, int k, int l) {
		int count =0;
		count = i > 0 ? ++count : count;
		count = j > 0 ? ++count : count;
		count = k > 0 ? ++count : count;
		count = l > 0 ? ++count : count;
			
		return count;
	}

	private static int positive(int i, int j, int k) {
		int count =0;
		count = i > 0 ? ++count : count;
		count = j > 0 ? ++count : count;
		count = k > 0 ? ++count : count;
			
		return count;
	}

	private static int positive(int i, int j) {
		int count =0;
		count = i > 0 ? ++count : count;
		count = j > 0 ? ++count : count;
			
		return count;
	}

	public static int positive(int i) {
		int count = 0;
	    count = i > 0 ? ++count : count;
		return count;
	}
	
}
