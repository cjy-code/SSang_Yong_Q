package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
	
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("¹®ÀÚ : ");
		String input = br.readLine();
		
		if(input.equals("f") || input.equals("F")) {
			System.out.println("Father");
		} else if(input.equals("m") || input.equals("M")) {
			System.out.println("Mather");
		} else if(input.equals("s") || input.equals("S")) {
			System.out.println("Sister");
		} else if(input.equals("b") || input.equals("B")) {
			System.out.println("Brother");
		}
   }
}
