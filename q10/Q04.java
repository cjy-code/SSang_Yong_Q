package com.test.question.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
	
	public static void main(String[] args) throws IOException {
		
		int gif=0, jpg=0, png=0, hwp=0, doc=0;
		
		
		for(int i=0; i<5; i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("파일명: ");
			String fileName = br.readLine();
			
			
			int index = fileName.indexOf('.');
			String a = fileName.substring(index+1, fileName.length());
			
			if(a.equals("gif")) {
				gif ++;
			}else if(a.equals("jpg")){
				jpg ++;
			}else if(a.equals("png")){
				png ++;
			}else if(a.equals("hwp")){
				hwp ++;
			}else if(a.equals("doc")){
				doc ++;
			}
		
		}//for
		System.out.printf("gif: %d개\n", gif);
		System.out.printf("jpg: %d개\n", jpg);
		System.out.printf("png: %d개\n", png);
		System.out.printf("hwp: %d개\n", hwp);
		System.out.printf("doc: %d개\n", doc);
		
		
	}

}
