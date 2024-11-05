package com.javaex.practice04;

public class Ex02 {

	public static void main(String[] args) {
		
		double[] num = {1.2, 3.3, 6.7};
				
		//	뒤에서부터 처음으로
		//	.length == 3
		// 인덱스 범위 0 ~ num.length - 1
		
		for (int i = num.length - 1; i >=0; --i) {
			System.out.println(num[i]);
		}

	}

}
