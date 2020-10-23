package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q05 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("한달 수입 금액(원) : ");
		String data = br.readLine();
		
		int N = Integer.parseInt(data);
		int After_Money =(int) (N-N*3.3/100);
		int Tax = (int)(N*3.3/100);
		int Year_IC = 12 * After_Money - (int)(N*3.5/100);		
		
		System.out.printf("세후 금액(원) : %,d\n", After_Money);
		System.out.printf("세금(원) : %,d\n", Tax);
		System.out.printf("1년 총 수입(세후) 금액(원) : %,d\n", Year_IC);

	}

}
