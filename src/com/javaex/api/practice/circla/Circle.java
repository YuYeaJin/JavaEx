package com.javaex.api.practice.circla;


public class Circle {
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		//	객체 내부 데이터의 문자열 출력
		return "Circle(" + x + "," + y +  radius + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			//	다운캐스팅
			Circle other = (Circle)obj;
			return radius == other.radius;
		}
		return super.equals(obj);
	}
		
}
