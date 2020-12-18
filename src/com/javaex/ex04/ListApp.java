package com.javaex.ex04;

import java.util.LinkedList;

public class ListApp {

	public static void main(String[] args) {

		//ArrayList 사용 - Rectangle 예제
		
		// ArrayList 사용
		//ArrayList<Rectangle> rList = new ArrayList<Rectangle>();
		// LinkedList 사용
		LinkedList<Rectangle> rList = new LinkedList<Rectangle>();
		
		Rectangle r01 = new Rectangle(3, 3);
		Rectangle r02 = new Rectangle(4, 4);

		rList.add(r01);
		rList.add(r02);

		Rectangle r = rList.get(0);
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());

		r.draw();
		System.out.println(r.toString());

		// size() test
		System.out.println(rList.size());

		Rectangle r03 = new Rectangle(100, 100);
		rList.add(0, r03); // 오버 로딩 : 같은 이름으로 여러개 만드는 것

		// 전체 출력 get() size() 사용
		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}
		System.out.println("==toString()=====================");
		
		System.out.println(rList.toString());
		

		System.out.println("=======================");

		// 삭제 remove()
		rList.remove(0);

		// 전체 출력 get() size() 사용
		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}

		System.out.println("=======================");
		rList.remove(r02);
		// 전체 출력 get() size() 사용
		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}
		
		
		System.out.println("===원 Circle====================");

		
		/////////////////////////////////////////////////////////////////
		//원
		// ArrayList 사용
		//ArrayList<Circle> cList = new ArrayList<Circle>();
		// LinkedList 사용
		LinkedList<Circle> cList = new LinkedList<Circle>();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(500);
		
		cList.add(c01);
		cList.add(c02);
		
		for(int i=0; i<cList.size(); i++) {
			cList.get(i).draw();
		}
		
		cList.toString();
		
		
	}

}
