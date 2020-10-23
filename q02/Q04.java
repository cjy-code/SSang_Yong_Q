package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("¿Ã∏ß : ");
		String name = br.readLine();
		
		
	    System.out.printf("∞Ì∞¥ : %s \n", getName(name));
		
		
		
		
	}//main
	
	public static String getName(String name) {
		
		String A = name;
		String B ="¥‘";
		
		return A+B;
	}
	


}
