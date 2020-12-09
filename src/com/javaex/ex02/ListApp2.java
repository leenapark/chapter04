package com.javaex.ex02;

public class ListApp2 {

	public static void main(String[] args) {
		//각각 리스트를 사용하는 게 아니라 ObjList 클래스를 이용
		
		System.out.println("==사각형==================");

		// 사각형 관리
		RectList rList = new RectList();

		Rectangle r01 = new Rectangle(3, 9);
		Rectangle r02 = new Rectangle(10, 10);

		rList.add(r01);
		rList.add(r02);
		for (int i = 0; i < rList.size(); i++) {
			((Rectangle)rList.get(i)).draw();
		}
		
		
		System.out.println("==원==================");

		
		//	원관리
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		
		ObjList cList = new ObjList();
		cList.add(c01);
		cList.add(c02);
		
		for(int i=0; i<cList.size(); i++) {
			((Circle)(cList.get(i))).draw();
		}
		
		System.out.println("==삼각형==================");
		
		Triangle t01 = new Triangle(1, 1);
		Triangle t02 = new Triangle(2, 2);
		
		ObjList tList = new ObjList();
		tList.add(t01);
		tList.add(t02);
		
		for(int i=0; i<tList.size(); i++) {
			((Triangle)(tList.get(i))).draw();
		}
		
	}

}
