package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	//	프로젝트 내의 Files 디렉터리 위치
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	
	static final String filebame = rootPath + "thieves.txt";
	
	
	public static void main(String[] args) {
		try(
			Reader freafer = new FileReader(filename);
			BufferedReader br = new BufferedReader(freader);	
		){
			String thief;
			
			while ((thief = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(thief, " ");
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					System.out.println(token + "  ");
				}
				System.out.println(thief);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
