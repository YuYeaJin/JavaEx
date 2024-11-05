package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		ex08();

	}
	
	public static void ex08() {
		int j = 2;
//		int i = 1;
		
		for (int i=1; j < 10; ++j) {
			System.out.print(j + "*" + i + "=" + (j*i));
			++i;
		}
	}
}
