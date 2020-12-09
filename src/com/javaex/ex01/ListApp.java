package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		// 사각형은 사각형끼리
		//	원은 원끼리
		//	삼각형은 삼각형끼리
		//	각각 리스트 생성
		
		
		//사각형 관리
		RectList rList = new RectList();
		
		Rectangle r01 = new Rectangle(3, 9);
		Rectangle r02 = new Rectangle(10, 10);
	
		rList.add(r01);
		rList.add(r02);
		
		Rectangle r100 = rList.get(0);
		r100.draw();
		
		for(int i=0; i<rList.size(); i++) {
			/*
			변수 r를 만들어줌 -> Ractangle r = rList.get(i);
			r.draw();
			*/
			// 위의 다른 표현
			rList.get(i).draw();
		}
		
		System.out.println(rList.size());
		
		//원 관리
		
		Circle cList = new Circle();
		
		
		
		
	}

}
