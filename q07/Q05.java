package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {
	
public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("9�ڸ� ���� �Է� : ");
		int input = Integer.parseInt(br.readLine());
		int each_Number = 0;
    	int even =0, odd=0;
    	
		int count = (int) Math.log10(input)+1;
		    	
    	for(int i=1; i <= count; i ++) {
    		if(count > 9) {
    			System.out.println("9�ڸ� �̻��� ���� �Դϴ�");
    			break;
    		}
    		if(i==1) {
    			each_Number=input%(int)Math.pow(10, i);
    			if(each_Number%2 != 0) {
    				odd += each_Number;
    			}else {
    				even += each_Number;
    			}
    		}else {
    			each_Number = input%(int)Math.pow(10, i)/(int)Math.pow(10, i-1);
    			if(each_Number%2 != 0) {
    				odd += each_Number;
    			}else {
    				even += each_Number;
    			}
    		}
    	   	if(i==9) break;
    		
    	}//for
    	System.out.printf("¦���� ��: %d\n",even);
    	System.out.printf("Ȧ���� ��: %d\n",odd);
	}
}