package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numArray[]=new int[5];
		double sum = 0;
		
		int i;
		for(i=0 ; i < numArray.length; ++i) {
			
			numArray[i]=scanner.nextInt();
			sum += numArray[i];
			
		}
		
		System.out.print("평균은" + sum/i + "입니다.");
	
	
	}

}
