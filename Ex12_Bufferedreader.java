package com.test.java;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

//*(wildcard) - 모든 클래스 -> all
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12_Bufferedreader {
	
	public static void main(String[] args) throws IOException {
		
		//Ex12_BufferedReader.java
		
		//문자 1개 입력 -> 출력
		
		System.out.print("문자: ");
		
		//System.in.read() 같은 역할 코드
		//Cntl + Shift + 0 : 패키지(클래스) Import 단축키
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//System.in.read(); 메서드
		//reader.read(); 메서드
		//reader.readLine(); 메서드
		
		
		//A(65) ~ Z(90)
		//a(97) ~ z(122)
		//0(48) ~ 9(47)
		//가(44032) ~힣(55203)
		//ㄱ ~ ㅎ
		//ㅏ ~ ㅣ

        //int data = reader.read();
        //System.out.printf("%c\n",data);
		
		//readLine(): 사용자 입력한 문장을 가져온다.(한 라인을 통째로 가져온다.)
	    //String data = reader.readLine();
	    //System.out.println(data);
		
		//요구사항] 사용자에게 이름을 입력받아 -> 인삿말을 출력하시오.
		System.out.print("이름 입력: ");
		
		String name = reader.readLine();
		
		System.out.printf("%s님 반갑습니다.\n", name);
		
		
		
		
	}

}
