package com.javaex.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
	
		usingEnum();
		//	switchpractice()의 enum버전

	}
	
	private static void usingEnum() {
		Week today = Week.TUESDAY;
		
		System.out.printf("Today is %s(%d)%n",
						today.name(),	//	열거 상수 -> String
						today.ordinal());
		
		String dayStr = "FRIDAY";
//		String dayStr = "BIRDTHDAY";
		//	String -> 열거상수 Convert
		Week obj = Week.valueOf(dayStr);
		System.out.printf(obj.name() + " " + obj.ordinal());
		
		//	열거 상수 목록
		System.out.println();
		
		System.out.println("Enum Week:");
		Week[] days = Week.values();
		
		for (int i = 0; i < days.length; ++i) {
			Week day = days[i];
			System.out.printf("%s -> %d%n", day.name(), day.ordinal());
		}
		
		//	compareTo : 두 객체 사이의 순서를 비교하는 메서드
		Week otherDay = Week.FRIDAY;
		//	TUESDAY와 FRIDAY의 순번 비교
		System.out.println(today.compareTo(otherDay));
	}

}
