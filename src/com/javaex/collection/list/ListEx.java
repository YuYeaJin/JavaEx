package com.javaex.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {

	//	순서가 있는 자료형, 중복 허용, List 인터페이스에 선언 되어 있음
	public static void main(String[] args) {
//		List<String> lst = new LinkedList<>();
		//	효율이 좋은 알고리즘을 알게 되었을때, List 인터페이스를 구현한 클래스라면 교체 가능

		List<String> lst = new ArrayList<>();
		//	객체 추가
		lst.add("Java");	// add : 맨 뒤에 새 아이템 추가
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		lst.add("Java");	//중복 허용
		
		
		System.out.println(lst);
		//	객체 중간에 삽입
		lst.add(2, "C#");
		System.out.println(lst);
		
		//	객체 삭제 : 인덱스로 삭제
		lst.remove(5);
		System.out.println(lst);
		
		//	객페 삭제 : 주어진 객체로 삭제
		lst.remove("Java");
		System.out.println(lst);
		
		//	요소 개수 확인
		System.out.println("size=" + lst.size());
		
		//	List와 Set는 Iterator 반복자를 사용
		System.out.println("====== Iteraror");
		Iterator<String> it = lst.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		
		//	리스트 비우기
		lst.clear();
		System.out.println(lst);
	}

}
