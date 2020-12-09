package com.javaex.ex02;

public class ObjList {

	//필드
	private Object[] oArray;
	private int crtPos;
	
	//생성자
	public ObjList() {
		oArray = new Object[3];
		crtPos = 0;
	}
	
	//메소드 g/s - 생략
	
	//메소드 일반
	public void add(Object o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return crtPos;
	}
	
	//단점이 각각 관리가 안되고 전부 들어와버림
}
