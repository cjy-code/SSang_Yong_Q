package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("국어 점수: " );
		int kor = Integer.parseInt(br.readLine());
		
		System.out.printf("영어 점수: " );
		int eng = Integer.parseInt(br.readLine());
		
		System.out.printf("수학 점수: " );
		int mat = Integer.parseInt(br.readLine());

		
		String[][] score = new String[10][3];
		 kor = kor / 10;
		 eng = eng / 10;
		 mat = mat / 10;
		 int max=10;
		 
		 for(int i =0; i<10; i++) {
				for(int j=0; j<3; j++) {
					
					if(kor== max) {
						score[i][0] = "■";
						kor--;
					}
					
					if(eng == max) {
						score[i][1] = "■";
						eng--;
					}
					
					if(mat == max) {
						score[i][2] = "■";
						mat--;
					}
				}
				max--;
			}

		 for(int i = 0; i<10; i++ ) { //출력
				for(int j=0; j<3; j++) { 
					
					if(score[i][j] == null) {
						score[i][j] = "";
					}
				
					
					System.out.printf("%4s", score[i][j]);
					if(j== 2) {
						System.out.println();
						
					}
					
					
				}
				
			}
			System.out.println("--------------");
			System.out.println("국어 영어 수학");
			
			
			
		}

	}
