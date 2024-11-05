package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		
		int i = scanner.nextInt();
		int p = 0;
		double average = 0;
		
		int[] sum = new int[4];
		for(int j = 0; j < sum.length; ++j) {
			average = sum[i] % i;
		}
		System.out.println("평균은 " + average + " 입니다.");
		

	}

}
