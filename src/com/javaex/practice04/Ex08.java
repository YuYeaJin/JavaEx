package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while (i < 6) {
			System.out.print((int)(Math.random()*45)+1);
			System.out.print("\t");
			++i;
		}
	}

}
