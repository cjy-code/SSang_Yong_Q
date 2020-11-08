package com.test.question.q09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int now_money =100000;
		int my_password = 1234;
		
		start();
		
		while(true) {
			
			int input = Integer.parseInt(br.readLine());
			System.out.println();
			
			switch (input) {
			case 1:
				System.out.println("=======================");
				System.out.println("	계좌 입금");
				System.out.println("=======================");
				System.out.print("계좌 비밀번호 : ");
				int password = Integer.parseInt(br.readLine());
				System.out.println();
				if(password==my_password) {
					System.out.print("입금액: ");
					int deposit = Integer.parseInt(br.readLine());
					System.out.println();
					now_money += deposit;
					System.out.printf("%,d원이 입금되었습니다.\n",deposit);
					System.out.println("계속하시려면 엔터를 입력하세요");
					String Enter = br.readLine();
					if(Enter.equals("")) {start();}
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
					System.out.println("계속하시려면 엔터를 입력하세요");
					String Enter = br.readLine();
					if(Enter.equals("")) {start();}
				}
				break;
			case 2:
				System.out.println("=======================");
				System.out.println("	계좌 출금");
				System.out.println("=======================");
				System.out.print("계좌 비밀번호 : ");
				password = Integer.parseInt(br.readLine());
				System.out.println();
				if(password==my_password) {
					System.out.print("출금액 :");
					int withdraw = Integer.parseInt(br.readLine());
					System.out.println();
					now_money -= withdraw;
					System.out.printf("%,d원이 출금되었습니다.\n", withdraw);
					System.out.println("계속하시려면 엔터를 입력하세요");
					String Enter = br.readLine();
					if(Enter.equals("")) {start();}
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
					System.out.println("계속하시려면 엔터를 입력하세요");
					String Enter = br.readLine();
					if(Enter.equals("")) {start();}
				}
				break;
			case 3:
				System.out.println("=======================");
				System.out.println("	잔액 조회");
				System.out.println("=======================");
				System.out.printf("현재 잔액 %,d원\n",now_money);
				System.out.println("계속하시려면 엔터를 입력하세요");
				String Enter = br.readLine();
				System.out.println();
				if(Enter.equals("")) {start();}
				break;
			case 4:
				
				break;

			default:
				break;
				
				
			}
		}
		

		
	}

	private static void start() {
		System.out.println("=======================");
		System.out.println("	My Bank");
		System.out.println("=======================");
		System.out.println("1. 계좌 입금");
		System.out.println("2. 계좌 출금");
		System.out.println("3. 계좌 조회");
		System.out.println("4. 종료");
		System.out.println("=======================");
		System.out.print("선택(번호): ");
		
	}

}
