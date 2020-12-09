package com.javaex.ex02;

public class Circle {

	//필드
	public int radius;

	//생성자
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}
	
	
	//메소드 g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	//메소드 일반
	// draw()
	public void draw() {
		System.out.println("원(반지름=" + radius + " )을 그렸습니다.");
	}
	
	
	//test
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
