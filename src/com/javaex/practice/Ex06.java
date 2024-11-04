package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		ex06();

	}
	
	public static void ex06() {
		
		int i = 1;
		while (true) {
			if (i %5 == 0 && i %7 == 0) break;
			++i;
		}
		System.out.println("5와 7로 나누어지는 수는 " + i +"이다.");
	
	}

}
