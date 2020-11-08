package com.test.question.q19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Example 
{
    public static void main(String[] args) throws IOException 
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //요구사항] 숫자를 2개 입력받아 더하기 연산을 하고 그 연산식과 결과를 출력하시오.
        System.out.print("숫자 1 : ");
        int input1 = Integer.parseInt(reader.readLine());

        System.out.print("숫자 2 : ");
        int input2 = Integer.parseInt(reader.readLine());

        System.out.printf("%d + %d = %d\n", input1, input2, input1 + input2);



        //요구사항] 숫자를 2개 입력받아 빼기 연산을 하고 그 연산식과 결과를 출력하시오.
        System.out.print("숫자 1 : ");
        String input3 = reader.readLine();
        int num3 = Integer.parseInt(input3);

        System.out.print("숫자 2 : ");
        String input4 = reader.readLine();
        int num4 = Integer.parseInt(input4);

        System.out.printf("%d - %d = %d\n", num3, num4, num3 - num4);

    } //main

}