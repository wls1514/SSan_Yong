package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14_BufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		
		//사용자에게 숫자 2개를 입력 -> +연산 -> 연산 과정과 결과를 출력하시오.
		
		//첫번째 숫자: 5
		//두번째 숫자: 3
		//결과] 5 + 3 =8
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫번째 숫자: ");
		String data1= br.readLine();
		
		System.out.print("두번째 숫자: ");
		String data2= br.readLine();
		
		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);
		
		int sum = num1 + num2;
		
		System.out.printf("결과] %d + %d = %d\n", num1, num2, sum);
	}

}
