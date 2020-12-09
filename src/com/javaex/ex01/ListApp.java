package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		// 사각형은 사각형끼리
		//	원은 원끼리
		//	삼각형은 삼각형끼리
		//	각각 리스트 생성
		
		System.out.println("==사각형==================");

		
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
		
		//배열 갯수 출력 해보기
		System.out.println(rList.size());
		
		
		System.out.println("==원==================");

		
		//원 관리
		CircleList cList = new CircleList();
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(4);
		
		cList.add(c01);
		cList.add(c02);
				
		Circle cc = cList.get(1);	//1번째 방
		cc.draw();
		
		//전체 출력
		for(int i=0; i<cList.size(); i++) {
			cList.get(i).draw();
		}
		
		System.out.println("==삼각형==================");
		//삼각형 관리
		
		TriangleList tList = new TriangleList();
		
		Triangle t01 = new Triangle(1, 2);
		Triangle t02 = new Triangle(3, 4);
		
		tList.add(t01);
		tList.add(t02);
		
		Triangle tri = tList.get(0);
		tri.draw();
		
		for(int i=0; i<tList.size(); i++) {
			tList.get(i).draw();
		}
	}

}
