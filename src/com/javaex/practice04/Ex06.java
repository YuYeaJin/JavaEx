package com.javaex.practice04;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		System.out.println(c);
		
		for(int i =0; i<c.length; i++) {
//			Arrays.toString(c);
			if(c[i] == ' ')	c[i] = ',';
			c[i] = c[i];
			System.out.print(c[i]);
	
		}

	}

}
