package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		ex07();

	}
	
	public static void ex07() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int i = scanner.nextInt();
		
		
		while(i == i+1) {
			
			System.out.println(i);
			i=i+1;
			
		}
		
		
	}

}
