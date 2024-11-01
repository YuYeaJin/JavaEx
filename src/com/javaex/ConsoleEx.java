package com.javaex;

import java.util.Scanner;

//	Tip 1 : crtl+shift+o : Organize Import
//	Tip 2 : ctrl+Space : 코드 자동 완성

//	console
//	표준 입력 : stdin -> System.in
//	표준 출력 : stdout -> Ststem.out
//	표준 에러 : stderr -> Ststem.err

public class ConsoleEx {

	public static void main(String[] args) {
//		consoleOutput();
		consoleInput();

	}
	//	콘솔 입력 예제
	public static void consoleInput() {
		//	표준 입력 : stdin -> System.in
		//	데이터 소스로부터 입력을 받는 Scanner 클래서 사용
		
		//	java.lang 이외의 기능을 불러올 때는 import 필요
		Scanner scanner = new Scanner(System.in);
		
		//	이름과 나이를 물어 출력하는 프로그램
		System.out.print("너 누구야? ");
		String name = scanner.next();
		System.out.print("나이는 몇살이야? ");
		int age = scanner.nextInt();
		
		
		System.out.println("Welcome, " + name);
		System.out.println("당신의 나이는 " + age + "세입니다.");
		
		//	시스템 자원은 다 쓰고 돌려줘야 한다.
		scanner.close();
	}

	//	콘솔 출력 예제
	public static void consoleOutput() {
		//	print : 개행 안함
		//	println : 개행 함
		//	printf : 형식 지정 문자열 출력 -> String
		
		System.out.print("Hello ");	// 개행 안 함
		System.out.println("Java");		//개행
		
		
		//	이스케이프 문자
		System.out.println("Hello\nJava");	//	\n: 개행
		System.out.println("Hello\tJava");	//	\t: 탭
		System.out.println("Hello, \"Java\"");
		
		System.out.println("\\: 역슬래시");	//	\\ -> \로 표시됨
		
	} 
	
	// Git 테스트를 위한 임시 주석
}
