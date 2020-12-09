package com.javaex.ex02;

public class TriangleList {

	//필드
	private Triangle[] tArray;
	private int crtPos;

	//생성자
	public TriangleList() {
		tArray = new Triangle[3];
		crtPos = 0;
	}
	
	//메소드 g/s - 생략
	
	//메소드 일반
	public void add(Triangle t) {
		tArray[crtPos] = t;
		crtPos++;
	}
	
	public Triangle get(int index) {
		return tArray[index];
	}
	
	public int size() {
		return crtPos;
	}
}
