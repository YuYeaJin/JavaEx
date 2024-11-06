package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		
		double k = scanner.nextDouble();
		int p = 0;
		double average = 0;
		
		int[] i = new int[5];
		for(int j = 0; j < i.length; ++j) {
	
			p = p + i[j] ;
		}
		System.out.println(p);
		

	}

}
