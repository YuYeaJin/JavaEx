package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		ex08();

	}
	
	public static void ex08() {
		int j = 2;
		int i = 1;
		
		while(i < 10) { if(j < 10) {
			System.out.println(j + "*" + i + "=" + (j*i));
			i +=1;
			continue;
			}
		}
	}
}
