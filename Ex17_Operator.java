package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17_Operator {
	
	public static void main(String[] args) throws IOException {
		
		
		//연산자
		//1. 산술 연산자 
		// - +, -, *, /, %
		// - 연산의 결과는 두 피연산자 중 더 큰 자료형으로 반환된다 (*****)
		// - 위의 상황을 컨트롤 하지 못하면 -> 오버플로우가( 언더플로우)가 발생한다.
		
		
		//2. 비교 연산자 
		// - >, >=, <, <=, ==, !=
		// - 2항 연산자 
		// - 피연산자들의 비교 우위를 반환하는 역할 
		// - 피연산자는 숫자를 가진다.
		// - 연산은 결과를 항상 boolean으로 반환한다.
		
		int a = 10;
		int b = 3;
		
		System.out.println(a > b); //t
		System.out.println(a >= b);//t
		System.out.println(a < b);//f
		System.out.println(a <= b);//f
		System.out.println(a == b);//f
		System.out.println(a != b);//t
		
		//나이 입력 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.println("나이: ");
		
		//String data =br.readLine();
		
		//System.out.println("홍길동" > "아무개"); (X)
		
		//int age = Integer.parseInt(data);
		
		//System.out.println(age >= 19); // 좋은 코드 
		//System.out.println( 19 <= age); //나쁜 코드 (되도록 사용하지 말 것)
		
		//-----------------------------------------------------------------------
		
		//유효성 검사, validation Check
		// -(사용자 입력) 데이터가 프로그램상에서 쓸모가 있는 값인지 아닌지를 판단하는 작업
		
		// 사용자 입력 문자 -> 소문자 입력 확인
		
		//참조형 <-> 값형(X)
		//String <-> int
		//System.out.println((int)data);
		
		
		System.out.print("문자: ");
		
		int code = br.read();
		System.out.println(code);
		
		System.out.println(code >= 97);
		System.out.println(code <= 122);
	    
	    System.out.println(code >= (int)'a');
	    System.out.println(code <= (int)'z');
	    
	    System.out.println(code >= 'a');
	    System.out.println(code <= 'z');
	    
	    System.out.println('a'>'b');
	    
	    System.out.println("한글 검사");
	    System.out.println(code >= '가');
	    System.out.println(code <= '힣');
	    
	    System.out.println("숫자 검사");
	    System.out.println(code >= '0');
	    System.out.println(code <= '9');
	    
	    //******************
	    System.out.println('홍'>'김');//O - 비교 연산자에서 char는 숫자취급 한다-> 값형끼리는 비교 연산이 가능
	   // System.out.println("홍">"김");//X - 참조형 끼리는 비교연산이 불가능
		
	    
	    
		
		
		
		
		
		
	}

}
